package com.yedil.kchess.service;


import com.yedil.kchess.config.security.ChessUser;
import com.yedil.kchess.data.entity.Game;
import com.yedil.kchess.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
    public Game makeMatch(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        if(gameRepository.existsByWhiteOrBlack(name, name)){
            gameRepository.deleteByWhiteOrBlack(name,name);
        }
        Game findGame = gameRepository.findByBlack("");
        if(findGame != null){
            findGame.setBlack(name);
            gameRepository.save(findGame);
            return findGame;
        }else{
            Game game = new Game(name,"","","",0,0,0,0,"white");
            gameRepository.save(game);
            return game;
        }
    }

    public Game makeMove(Game game){
        gameRepository.save(game);
        return game;
    }

    public Game getLatestMove(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Game game = gameRepository.findByWhiteOrBlack(name, name);
        return game;
    }
}
