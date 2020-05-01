package com.yedil.kchess.controller.api;


import com.yedil.kchess.data.gameModels.Const;
import com.yedil.kchess.data.gameModels.MatchMakingMessage;
import com.yedil.kchess.data.gameModels.MatchMakingMessageType;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.*;

@Log4j2
@Controller
public class GameController {

    //不存已经开始的游戏，存正在排队的人。
    //存房间id 和 人， 离开了直接发送消息给房间

    private static List roomsForStandard2P = Collections.synchronizedList(new ArrayList());
    private static List roomsForExtended2P = Collections.synchronizedList(new ArrayList());
    private static List roomsForExtended4P = Collections.synchronizedList(new ArrayList());
    private static List roomsForExtended4PT = Collections.synchronizedList(new ArrayList());

    public static Map<String,String> players = new HashMap<>();

    private final SimpMessagingTemplate template;

    public GameController(SimpMessagingTemplate simpMessagingTemplate) {
        this.template = simpMessagingTemplate;
    }

    @MessageMapping("/makeMatch")
    public void makeMatch(@Payload MatchMakingMessage matchMakingMessage,
                          @Header(value = "authorization") String authorizationToken,
                          SimpMessageHeaderAccessor headerAccessor) {
        if(authorizationToken == null)
            return;
        String newPlayer = authorizationToken;
        String room_id = null;
        MatchMakingMessageType currentType = matchMakingMessage.getMessageType();
        if (currentType.equals(MatchMakingMessageType.CONNECT)) {
            cancelOption(newPlayer, matchMakingMessage);
            room_id = connectOption(newPlayer, matchMakingMessage);
            if(room_id != null){
                headerAccessor.getSessionAttributes().put("username",newPlayer);
                headerAccessor.getSessionAttributes().put("room_id",room_id);
            }
        } else if (currentType.equals(MatchMakingMessageType.CANCEL)) {
            cancelOption(newPlayer, matchMakingMessage);
        } else {
            log.error("Wrong number of players received in makeMatch");
        }
        log.info("Received a making matching message: " + newPlayer +matchMakingMessage.toString());
        logAllArgs();
        //template.convertAndSend("/queue/makeMatch-" + newPlayer.getId(), matchMakingMessage);
    }

//    @MessageMapping("/makeMove")
//    public void makeMove(MoveMessage moveMessage, @Header(value = "authorization") String authorizationToken) {
//        String username = authorizationToken;
//        log.info("Received a move message: " + moveMessage.toString());
//        String me = players.stream().filter(p -> p.equals(username)).findAny().orElse(null);
//        Log.info("Received a move message: " + moveMessage.toString());
//        Room myRoom;
//    }


    public String connectOption(String newPlayer, MatchMakingMessage matchMakingMessage) {
        int gameType = matchMakingMessage.getGameType();
        int n = roomTypeToNumOfPlayers(gameType);
        String room_id = null;
        String[] playersInTheRoom;
        switch (gameType) {
            case Const.Standard2P:
                room_id = makeMatchMethod(roomsForStandard2P, newPlayer, n);
                break;
            case Const.Extended2P:
                room_id = makeMatchMethod(roomsForExtended2P, newPlayer, n);
                break;
            case Const.Extended4P:
                room_id = makeMatchMethod(roomsForExtended4P, newPlayer, n);
                break;
            case Const.Extended4PT:
                room_id = makeMatchMethod(roomsForExtended4PT, newPlayer, n);
                break;
        }
        if (room_id != null) {
            String currentPlayer = null;
            playersInTheRoom = room_id.split("-");
            MatchMakingMessage message = new MatchMakingMessage(MatchMakingMessageType.CONNECTED, matchMakingMessage.getGameType(), playersInTheRoom, room_id);
            for (int i = 0; i < n; i++) {
                currentPlayer = playersInTheRoom[i];
                players.put(currentPlayer, room_id);
                template.convertAndSend("/queue/makeMatch-" + currentPlayer, message);
            }
        }

        return room_id;
    }

    public void cancelOption(String newPlayer, MatchMakingMessage matchMakingMessage) {
        players.remove(newPlayer);
        switch (matchMakingMessage.getGameType()) {
            case Const.Standard2P:
                roomsForStandard2P.remove(newPlayer);
                break;
            case Const.Extended2P:
                roomsForExtended2P.remove(newPlayer);
                break;
            case Const.Extended4P:
                roomsForExtended4P.remove(newPlayer);
                break;
            case Const.Extended4PT:
                roomsForExtended4PT.remove(newPlayer);
                break;
        }
    }

    public String makeMatchMethod(List room, String newPlayer, int n){
        room.add(newPlayer);
        String room_id = null;
        StringBuilder sb = new StringBuilder();
        if(room.size() == n){
            for(int i=0; i<n; i++){
                sb.append(room.get(i));
                if(i != n - 1)
                    sb.append("-");
            }
            room.clear();
            room_id = sb.toString();
        }
        return room_id;
    }
    public int roomTypeToNumOfPlayers(int type) {
        return type == Const.Standard2P || type == Const.Extended2P ? 2 : 4;
    }

    public static void logAllArgs(){
        log.info("Current player maps: " + players.toString());
        log.info("Current roomsForStandard2P: " + roomsForStandard2P.toString());
        log.info("Current roomsForExtended2P: " + roomsForExtended2P.toString());
        log.info("Current roomsForExtended4P: " + roomsForExtended4P.toString());
        log.info("Current roomsForExtended4PT: " + roomsForExtended4PT.toString());
    }
}
