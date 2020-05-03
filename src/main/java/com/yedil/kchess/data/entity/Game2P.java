package com.yedil.kchess.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "game2P")
public class Game2P extends BaseEntity {

    @Column(name = "player1")
    private String player1;

    @Column(name = "player2")
    private String player2;

    @Column(name = "FEN")
    private String FEN;

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

    @Column(name = "made_by")
    private String made_by;

    @Column(name = "type")
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int game_type) {
        this.type = game_type;
    }

    public Game2P(int type) {
        this.type = type;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String white) {
        this.player1 = white;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String black) {
        this.player2 = black;
    }

    public Game2P() {
    }

    public Game2P(String player1, String player2, String FEN, String result,
                  int from_x, int from_y, int to_x, int to_y, String made_by, int type) {
        this.player1 = player1;
        this.player2 = player2;
        this.FEN = FEN;
        this.result = result;
        this.from_x = from_x;
        this.from_y = from_y;
        this.to_x = to_x;
        this.to_y = to_y;
        this.made_by = made_by;
        this.type = type;
    }

    public String getFen() {
        return FEN;
    }

    public void setFen(String fen) {
        this.FEN = fen;
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

    public String getMade_by() {
        return made_by;
    }

    public void setMade_by(String next_move) {
        this.made_by = next_move;
    }

    @Override
    public String toString() {
        return "Game2P{" +
                "id=" + id +
                ", player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                ", FEN='" + FEN + '\'' +
                ", result='" + result + '\'' +
                ", from_x=" + from_x +
                ", from_y=" + from_y +
                ", to_x=" + to_x +
                ", to_y=" + to_y +
                ", made_by='" + made_by + '\'' +
                ", type=" + type +
                '}';
    }
}
