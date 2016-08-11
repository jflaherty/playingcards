package com.github.wsppan.cardgames.playingcards.french;

import java.util.HashMap;
import java.util.Map;

import com.github.wsppan.cardgames.playingcards.ISuit;
import com.github.wsppan.cardgames.playingcards.exceptions.IllegalSuitException;

public enum Suit implements ISuit {

    CLUBS(0, SuitColor.BLACK, SuitIcon.CLUBS), DIAMONDS(1, SuitColor.RED, SuitIcon.DIAMONDS), HEARTS(2, SuitColor.RED, SuitIcon.HEARTS), SPADES(3,
	    SuitColor.BLACK, SuitIcon.SPADES);

    private int suitValue;
    private SuitColor color;
    private SuitIcon icon;

    private final static Map<Character, Suit> suitMap = new HashMap<Character, Suit>(Suit.values().length, 1.0f);
    static {
	for (Suit suit : Suit.values()) {
	    suitMap.put(suit.getSuitIcon().getSymbol(), suit);
	}
    }

    /**
     * Builds this object.
     * 
     * @param color
     *            representing a suit color
     * @param icon
     *            representing a suit icon
     * 
     */
    Suit(int value, SuitColor color, SuitIcon icon) {
	this.suitValue = value;
	this.color = color;
	this.icon = icon;
    }

    public SuitIcon getSuitIcon() {
	return icon;
    }

    public SuitColor getSuitColor() {
	return color;
    }

    public int asInt() {
	return this.suitValue;
    }

    public static Suit fromChar(char suitChar) throws IllegalSuitException {
	Suit suit = suitMap.get(suitChar);
	if (suit == null) {
	    throw new IllegalSuitException(suitChar + " is an illegal Suit notation");
	}

	return suit;
    }

}