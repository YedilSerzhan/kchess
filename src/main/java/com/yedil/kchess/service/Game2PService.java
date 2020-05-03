package com.yedil.kchess.service;


import com.yedil.kchess.data.entity.Game2P;
import com.yedil.kchess.repository.Game2PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class Game2PService {

    private final Game2PRepository game2PRepository;

    @Autowired
    public Game2PService(Game2PRepository game2PRepository) {
        this.game2PRepository = game2PRepository;
    }

    @Transactional
    public Game2P makeMatch(int type){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
        if(game2PRepository.existsByPlayer1OrPlayer2(name, name)){
            game2PRepository.deleteByPlayer1OrPlayer2(name,name);
        }
        Game2P findGame2P = game2PRepository.findByPlayer2AndType("", type);
        if(findGame2P != null){
            findGame2P.setPlayer2(name);
            game2PRepository.save(findGame2P);
            return findGame2P;
        }else{
            Game2P game2P = new Game2P(name,"","","",0,0,0,0,"",type);
            game2PRepository.save(game2P);
            return game2P;
        }
    }

    public Game2P makeMove(Game2P game2P){
        game2PRepository.save(game2P);
        return game2P;
    }

    public Game2P getLatestMove(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Game2P game2P = game2PRepository.findByPlayer1OrPlayer2(name, name);
        return game2P;
    }
}
