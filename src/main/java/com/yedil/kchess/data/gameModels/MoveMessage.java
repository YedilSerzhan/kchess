package com.yedil.kchess.data.gameModels;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MoveMessage {

    private int from_x;
    private int from_y;
    private int to_x;
    private int to_y;
    private String playerID;
    private MoveMessageType type;
}
