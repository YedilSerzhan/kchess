package com.yedil.kchess.service;


import com.yedil.kchess.data.entity.Game;
import com.yedil.kchess.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional
    public Game makeMatch(int type) {
        int nums_of_players = type < 3 ? 2 : 4;
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        //System.out.println(name);
        if (gameRepository.existsByPlayer1OrPlayer2OrPlayer3OrPlayer4(name, name, name, name)) {
            gameRepository.deleteByPlayer1OrPlayer2OrPlayer3OrPlayer4(name, name, name, name);
        }
        if (type == 1 || type == 2) {
            Game findGame = gameRepository.findByPlayer2AndType("", type);
            if (findGame != null) {
                findGame.setPlayer2(name);
                gameRepository.save(findGame);
                return findGame;
            } else {
                Game game = new Game(name, "", "", "", "", "",
                        0, 0, 0, 0, "", type);
                gameRepository.save(game);
                return game;
            }
        } else {
            return null;
        }
    }

    public Game makeMove(Game game) {
        gameRepository.save(game);
        return game;
    }

    public Game getLatestMove() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Game game = gameRepository.findByPlayer1OrPlayer2(name, name);
        return game;
    }
}
