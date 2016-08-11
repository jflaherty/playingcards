package com.github.wsppan.cardgames.playingcards.french;

import java.util.HashMap;
import java.util.Map;

import com.github.wsppan.cardgames.playingcards.IRank;
import com.github.wsppan.cardgames.playingcards.exceptions.IllegalRankException;

public enum Rank implements IRank {
    ACE_L(1, '1'), 
    TWO(2, '2'), 
    THREE(3, '3'), 
    FOUR(4, '4'), 
    FIVE(5, '5'), 
    SIX(6, '6'), 
    SEVEN(7, '7'), 
    EIGHT(8, '8'), 
    NINE(9, '9'), 
    TEN(10, 'T'), 
    JACK(11, 'J'), 
    QUEEN(12, 'Q'), 
    KING(13, 'K'), 
    ACE_H(14, 'A');

    private int cardValue;
    private char rank;
    private final static Map<Character, Rank> rankMap = new HashMap<Character, Rank>(Rank.values().length, 1.0f);
    static {
	for (Rank rank : Rank.values()) {
	    rankMap.put(rank.getRank(), rank);
	}
    }

    Rank(int value, char character) {
	this.cardValue = value;
	this.rank = character;
    }

    public int asInt() {
	return cardValue;
    }

    public char getRank() {
	return rank;
    }

    public static Rank fromChar(char rankChar) throws IllegalRankException {
	Rank rank = rankMap.get(rankChar);
	if (rank == null) {
	    throw new IllegalRankException(rankChar + " is an illegal Rank notation");
	}

	return rank;
    }

    /**
     * Returns string representation of selected Rank.
     * 
     * @return rank
     */
    @Override
    public String toString() {
	return Character.toString(rank);
    }

}
