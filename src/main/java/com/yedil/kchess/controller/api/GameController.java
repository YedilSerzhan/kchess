package com.yedil.kchess.controller.api;

import com.yedil.kchess.data.entity.Game;
import com.yedil.kchess.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(path = "game/new/{type}")
    public Game getGameId(@PathVariable(name = "type") Integer type) {
        Game game = gameService.makeMatch(type);
//        System.out.println("game2p/new/"+ String.valueOf(type)+" "+game2P.toString());
        return game;
    }

    @PostMapping(path = "game/make/move")
    public Game makeMove(Game game) {
//        System.out.println("game2p/make/move "+game2P.toString());
        return gameService.makeMove(game);
    }

    @GetMapping(path = "game/get/move")
    public Game getLatestMove() {
        Game game = gameService.getLatestMove();
//        System.out.println("game2p/get/move" +game2P.toString());
        return game;
    }
}
