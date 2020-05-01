package com.yedil.kchess.data.gameModels;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MatchMakingMessage {

    private MatchMakingMessageType messageType;

    private int gameType;

    private String[] players;

    private String room_id;
}
