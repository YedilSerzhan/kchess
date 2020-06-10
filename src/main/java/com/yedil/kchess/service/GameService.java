package com.yedil.kchess.service;


import com.yedil.kchess.data.entity.Game;
import com.yedil.kchess.data.entity.History;
import com.yedil.kchess.repository.GameRepository;
import com.yedil.kchess.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class GameService {

    private final GameRepository gameRepository;
    private final HistoryRepository historyRepository;

    @Autowired
    public GameService(GameRepository gameRepository, HistoryRepository historyRepository) {
        this.gameRepository = gameRepository;
        this.historyRepository = historyRepository;
    }

    @Transactional
    public Game makeMatch(int type) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        //System.out.println(name);
        if (gameRepository.existsByPlayer1OrPlayer2OrPlayer3OrPlayer4(name, name, name, name)) {
            gameRepository.deleteByPlayer1OrPlayer2OrPlayer3OrPlayer4(name, name, name, name);
        }
        Game findGame;
        int pos;
        if (type >= 1 && type <= 4) {
            findGame = gameRepository.findByPlayer2AndType("", type);
            pos = 2;
            if (type > 2) {
                if (findGame == null) {
                    findGame = gameRepository.findByPlayer3AndType("", type);
                    pos = 3;
                    if (findGame == null) {
                        findGame = gameRepository.findByPlayer4AndType("", type);
                        pos = 4;
                    }
                }
            }
            if (findGame == null) {
                pos = 1;
                findGame = new Game("", "", "", "", "", "",
                        0, 0, 0, 0, "", type);
            }
            findGame = setPlayAndSave(name, pos, findGame);
            return findGame;
        } else
            return null;
    }

    Game setPlayAndSave(String player, int pos, Game game) {
        if (pos == 1) {
            game.setPlayer1(player);
        } else if (pos == 2)
            game.setPlayer2(player);
        else if (pos == 3)
            game.setPlayer3(player);
        else if (pos == 4)
            game.setPlayer4(player);
        gameRepository.save(game);
        return game;
    }

    public Game makeMove(Game game) {
        gameRepository.save(game);
        if(game.getResult().equals("over")){
            String date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
            History h = new History(game.getPlayer1(), game.getPlayer2(), game.getPlayer3(), game.getPlayer4(), game.getFEN(), game.getType(), date);
            historyRepository.save(h);
        }
        return game;
    }

    public Game getLatestMove(Long id) {
        Game game = gameRepository.findById(id).orElse(null);
        return game;
    }

    public void cancelMatch(Long id){
        gameRepository.deleteById(id);
    }
}
