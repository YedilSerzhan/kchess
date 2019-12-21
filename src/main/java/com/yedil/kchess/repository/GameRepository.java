package com.yedil.kchess.repository;

import com.yedil.kchess.data.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

    boolean existsByWhiteOrBlack(String white, String black);

    void deleteByWhiteOrBlack(String white, String black);

    Game findByWhiteOrBlack(String white, String black);

    Game findByBlack(String black);
}
