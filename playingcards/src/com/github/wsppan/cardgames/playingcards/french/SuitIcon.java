package com.github.wsppan.cardgames.playingcards.french;

import com.github.wsppan.cardgames.playingcards.ISuitIcon;

public enum SuitIcon implements ISuitIcon {

    CLUBS("♣", 'C'), DIAMONDS("♦", 'D'), HEARTS("♥", 'H'), SPADES("♠", 'S');

    private String icon;
    private char symbol;

    SuitIcon(String icon, char symbol) {
	this.icon = icon;
	this.symbol = symbol;
    }

    @Override
    public String toString() {
	return getIcon() + " " + getSymbol();
    }

    /**
     * Returns icon of a Suit.
     * 
     * @return text icon
     */
    public String getIcon() {
	return this.icon;
    }

    public char getSymbol() {
	return symbol;
    }
}
