package com.github.wsppan.cardgames.playingcards.french;

import com.github.wsppan.cardgames.playingcards.ICard;
import com.github.wsppan.cardgames.playingcards.exceptions.IllegalCardException;

public final class Card implements ICard, Comparable<Card> {
    private final Suit suit;
    private final Rank rank;
    private final String handNotation;
    private final String pokerNotation;
    private final String wikiSyntax;

    /**
     * Create the ACE_H of Spades
     */
    public Card() {
	this(Rank.ACE_H, Suit.SPADES);
    }

    /**
     * Builds this object with specified Rank and Suit in two-character hand
     * notation.
     * 
     * @param str
     *            string representing Card in hand notation
     * @throws IllegalCardException
     */
    public Card(String str) throws IllegalCardException {
	this(Rank.fromChar(str.replaceAll("^0", "").replaceAll("10", "T").charAt(0)), Suit.fromChar(str.replaceAll("^0", "").replaceAll("10", "T").charAt(1)));
    }

    /**
     * Builds this object with specified Rank and Suit.
     * 
     * @param suit
     *            a Suit of this object
     * @param rank
     *            a Rank of this object
     * 
     */
    public Card(Rank rank, Suit suit) {

	this.rank = rank;
	this.suit = suit;

	this.handNotation = rank.toString() + suit.toString();
	this.pokerNotation = rank.toString() + suit.getSuitIcon() + suit.getSuitColor();
	this.wikiSyntax = "{{cards|" + rank + suit + "}}";
    }

    /**
     * Returns poker card suit and rank in hand notation.
     * 
     * @return this object in hand notation
     */
    @Override
    public String toString() {
	return getHandNotation();
    }

    /**
     * Returns poker card suit and rank in hand notation.
     * 
     * @return this object in hand notation
     */
    public String getHandNotation() {
	return this.handNotation;
    }

    /**
     * Returns poker card suit and rank in poker notation.
     * 
     * @return this object in poker notation
     */
    public String getPokerNotation() {
	return this.pokerNotation;
    }

    /**
     * Returns the card suit and rank in WikiSyntax.
     * 
     * @return this object in WikiSyntax
     */
    public String getWikiSyntax() {
	return this.wikiSyntax;
    }

    /**
     * Returns poker card Rank.
     * 
     * @return a rank of this object
     */
    public Rank getRank() {
	return this.rank;
    }
    
    public boolean isFaceCard() {
	return this.rank.asInt() > 9;
    }

    /**
     * Returns poker card Suit.
     * 
     * @return a suit of this object
     */
    public Suit getSuit() {
	return this.suit;
    }

    /**
     * Returns poker card icon as text.
     * 
     * @return text icon
     */
    public SuitIcon getSuitIcon() {
	return getSuit().getSuitIcon();
    }

    /**
     * Returns poker card suit color as a hex string.
     * 
     * @return hex string
     */
    public SuitColor getColor() {
	return getSuit().getSuitColor();
    }

    public boolean isAceHigh() {
	return this.rank.equals(Rank.ACE_H);
    }
    
    @Override
    public int compareTo(Card otherCard) {
	return (this.rank.asInt() - otherCard.rank.asInt()) * 4 + this.suit.asInt() - otherCard.suit.asInt();

    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = prime * 1 + ((rank == null) ? 0 : rank.hashCode());
	result = prime * result + ((suit == null) ? 0 : suit.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object otherObj) {
	if (this == otherObj) {
	    return true;
	}
	if (otherObj == null || getClass() != otherObj.getClass()) {
	    return false;
	}
	Card other = (Card) otherObj;
	return this.rank.asInt() == other.rank.asInt() && this.suit.asInt() == other.suit.asInt()
		&& this.suit.getSuitColor().getColor().equals(other.suit.getSuitColor().getColor())
		&& this.suit.getSuitIcon().getSymbol() == other.suit.getSuitIcon().getSymbol();
    }

}
