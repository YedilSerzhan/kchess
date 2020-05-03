package com.yedil.kchess.controller.api;

import com.yedil.kchess.data.entity.Game2P;
import com.yedil.kchess.service.Game2PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class GameController {

    private final Game2PService game2PService;

    @Autowired
    public GameController(Game2PService game2PService) {
        this.game2PService = game2PService;
    }

    @GetMapping(path = "game2p/new/{type}")
    public Game2P getGameId(@PathVariable(name = "type") Integer type) {
        return game2PService.makeMatch(type);
    }

    @PostMapping(path = "game2p/make/move")
    public Game2P makeMove(Game2P game2P) {
        System.out.println(game2P);
        return game2PService.makeMove(game2P);
    }

    @GetMapping(path = "game2p/get/move")
    public Game2P getLatestMove() {
        return game2PService.getLatestMove();
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
