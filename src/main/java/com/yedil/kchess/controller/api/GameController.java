package com.yedil.kchess.controller.api;

import com.yedil.kchess.data.entity.Game;
import com.yedil.kchess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(path = "/new")
    public Game getGameId() {
        return gameService.makeMatch();
    }

    @PostMapping(path = "/make/move")
    public Game makeMove(Game game) {
        System.out.println(game);
        return gameService.makeMove(game);
    }

    @GetMapping(path = "/get/move")
    public Game getLatestMove() {
        return gameService.getLatestMove();
    }


    private class Position {

        int gameId;
        String FEN;

        public int getGameId() {
            return gameId;
        }

        public void setGameId(int gameId) {
            this.gameId = gameId;
        }

        public String getFEN() {
            return FEN;
        }

        public void setFEN(String FEN) {
            this.FEN = FEN;
        }

        Position(int gameId, String FEN) {
            this.gameId = gameId;
            this.FEN = FEN;
        }
    }
    //
}
