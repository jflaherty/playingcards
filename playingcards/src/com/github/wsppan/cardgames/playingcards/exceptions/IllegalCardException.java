package com.github.wsppan.cardgames.playingcards.exceptions;

public class IllegalCardException extends Exception {

    private static final long serialVersionUID = 7497502874730089039L;

    public IllegalCardException(String message) {
	super(message);
	System.err.println(message);
    }

}
