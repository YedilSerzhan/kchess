package com.yedil.kchess.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/game")
public class GameController {


    @GetMapping(path = "/new")
    public Game getGameId(){

        final Game game = new Game(1, "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        return game;
    }



    private class Game{

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

        Game(int gameId, String FEN) {
            this.gameId = gameId;
            this.FEN = FEN;
        }
    }
    //
}
