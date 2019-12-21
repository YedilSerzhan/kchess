package com.yedil.kchess.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "game")
public class Game extends BaseEntity {

    @Column(name = "white_id")
    private Long whiteId;

    @Column(name = "black_id")
    private Long blackId;

    @Column(name = "FEN")
    private String fen;

    @Column(name = "result")
    private String result;

    @Column(name = "from_x")
    private int from_x;

    @Column(name = "from_y")
    private int from_y;

    @Column(name = "to_x")
    private int to_x;

    @Column(name = "to_y")
    private int to_y;

    @Column(name = "next_move")
    private String next_move;

    public Long getWhiteId() {
        return whiteId;
    }

    public void setWhiteId(Long whiteId) {
        this.whiteId = whiteId;
    }

    public Long getBlackId() {
        return blackId;
    }

    public void setBlackId(Long blackId) {
        this.blackId = blackId;
    }

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getFrom_x() {
        return from_x;
    }

    public void setFrom_x(int from_x) {
        this.from_x = from_x;
    }

    public int getFrom_y() {
        return from_y;
    }

    public void setFrom_y(int from_y) {
        this.from_y = from_y;
    }

    public int getTo_x() {
        return to_x;
    }

    public void setTo_x(int to_x) {
        this.to_x = to_x;
    }

    public int getTo_y() {
        return to_y;
    }

    public void setTo_y(int to_y) {
        this.to_y = to_y;
    }

    public String getNext_move() {
        return next_move;
    }

    public void setNext_move(String next_move) {
        this.next_move = next_move;
    }
}
