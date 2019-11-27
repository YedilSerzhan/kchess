package com.yedil.kchess.service.exceptions;

public class NoCandidateException extends MatchmakingException {

    public NoCandidateException() {
        super("no.candidate.available");
    }
}
