package com.yedil.kchess.repository;

import com.yedil.kchess.data.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

    boolean existsByPlayer1OrPlayer2OrPlayer3OrPlayer4(String player1, String player2, String player3, String player4);

    void deleteByPlayer1OrPlayer2OrPlayer3OrPlayer4(String player1, String player2, String player3, String player4);

    Game findByPlayer1OrPlayer2(String player1, String player2);

    Game findByPlayer2AndType(String player2, int game_type);
    Game findByPlayer3AndType(String player3, int game_type);
    Game findByPlayer4AndType(String player4, int game_type);

}
