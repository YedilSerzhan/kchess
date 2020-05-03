package com.yedil.kchess.repository;

import com.yedil.kchess.data.entity.Game2P;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Game2PRepository extends CrudRepository<Game2P, Long> {

    boolean existsByPlayer1OrPlayer2(String player1, String player2);

    void deleteByPlayer1OrPlayer2(String player1, String player2);

    Game2P findByPlayer1OrPlayer2(String player1, String player2);

    Game2P findByPlayer2AndType(String player2, int game_type);

}
