package com.yedil.kchess.service.exceptions;

public class ProfileNotFilledException extends MatchmakingException {

    public ProfileNotFilledException() {
        super("profile.not.filled");
    }
}
