package com.yedil.kchess.service.exceptions;

public class IllegalVoteException extends MatchmakingException {

    public IllegalVoteException() {
        super("illegal.vote");
    }
}
