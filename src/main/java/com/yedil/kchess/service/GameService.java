package com.yedil.kchess.service;


import com.yedil.kchess.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public boolean isInMatching(){

        return false;
    }

    public String makeMove(){


        return "";
    }

}
