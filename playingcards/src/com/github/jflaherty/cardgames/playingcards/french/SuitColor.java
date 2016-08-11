package com.github.jflaherty.cardgames.playingcards.french;

import com.github.jflaherty.cardgames.playingcards.ISuitColor;

public enum SuitColor implements ISuitColor {

    BLACK("#000000"), RED("#FF0000");

    private String hexString;

    /**
     * Builds this object.
     * 
     * @param hex
     *            color string
     */
    SuitColor(String hex) {
	this.hexString = hex;
    }

    /**
     * Returns string representation of this object.
     * 
     * @return text string
     */
    @Override
    public String toString() {
	return getColor();
    }

    /**
     * Returns color of a Suit.
     * 
     * @return suit color in hexadecimal
     */
    public String getColor() {
	return this.hexString;
    }

}
