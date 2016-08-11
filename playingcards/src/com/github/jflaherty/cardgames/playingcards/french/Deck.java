package com.github.wsppan.cardgames.playingcards.french;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import com.github.wsppan.cardgames.playingcards.exceptions.EmptyDeckException;
import com.github.wsppan.cardgames.playingcards.IDeck;

/**
 * PokerDeck.java - Builds a full deck of Cards.
 * 
 * 
 */

public final class Deck implements IDeck, Iterable<Card> {

    private static final String MSG_DECK_EMPTY = "Deck is empty.";

    private List<Card> deck = new ArrayList<Card>();
    private int count = 0;
    private String handNotation = "";
    private String pokerNotation = "";
    private String wikiSyntax = "";

    /**
     * Builds this object as a full deck.
     */
    public Deck() {

	List<Card> d = new ArrayList<Card>();

	for (Suit s : Suit.values()) {
	    for (Rank r : Rank.values()) {
		d.add(new Card(r, s));
	    }
	}

	this.deck = d;
	updateDeck();
    }
    
    public Deck(List<Card> d) {
	this.deck = d;
	updateDeck();
    }

    /**
     * Builds this object as a single-suit quarter-deck.
     * 
     * @param poker
     *            card Suit
     */
    public Deck(Suit s) {

	List<Card> d = new ArrayList<Card>();

	for (Rank r : Rank.values()) {
	    d.add(new Card(r, s));
	}

	this.deck = d;
	updateDeck();
    }

    /**
     * Builds this object as a multi-suit quarter-decks (one Suit), half-decks
     * (two Suits), three-quarters-decks (three Suits), and full decks (all four
     * Suits.)
     * 
     * @param poker
     *            card Suit
     */
    public Deck(EnumSet<Suit> es) {

	List<Card> d = new ArrayList<Card>();
	Suit s;
	Iterator<Suit> suits = es.iterator();
	while (suits.hasNext()) {
	    s = (Suit) suits.next();
	    for (Rank r : Rank.values()) {
		d.add(new Card(r, s));
	    }
	}

	this.deck = d;
	updateDeck();
    }


    /**
     * returns the hand notation
     */
    @Override
    public String toString() {
	return getHandNotation();
    }

    /**
     * Returns number of Cards in this object.
     * 
     * @return this object
     */
    public int getCount() {
	return this.count;
    }

    /**
     * Shuffles the collection of Cards in this object.
     * 
     * @return this object
     */
    public void shuffleDeck() {
	Collections.shuffle(this.deck);
	updateDeck();
    }

    /**
     * Draws the top card from this object.
     * 
     * @return the first listed Card in this object
     * @throws EmptyDeckException
     */
    public Card drawTopCard() throws EmptyDeckException {
	if (deck.isEmpty()) {
	    throw new EmptyDeckException(MSG_DECK_EMPTY);
	}
	Card c = deck.remove(deck.size() - 1);
	updateDeck();
	return c;

    }

    /**
     * Returns list of cards in the poker deck in hand notation, with a
     * combination of alphanumeric symbols.
     * 
     * @return a list of cards in deck in hand notation
     */
    public String getHandNotation() {
	return this.handNotation;
    }

    /**
     * Returns list of cards in the poker deck in poker notation, with a
     * combination of alphanumeric symbols and icons.
     * 
     * @return a list of cards in deck in hand notation
     */
    public String getPokerNotation() {
	return this.pokerNotation;
    }

    /**
     * Returns list of cards in the poker deck in WikiSyntax.
     * 
     * @return a list of cards in deck in WikiSyntax
     */
    public String getWikiSyntax() {
	return this.wikiSyntax;
    }

    // operations that update this object's properties
    private void updateDeck() {

	String handNotation = "";
	String pokerNotation = "";
	String wikiSyntax = "";

	// list all cards in the deck
	for (Card card : deck) {
	    handNotation += card + " ";
	    pokerNotation += card.getPokerNotation() + " ";
	}

	// cleanup
	handNotation = handNotation.trim().replace(" ", ",");
	pokerNotation = pokerNotation.trim().replace(" ", ",");
	wikiSyntax = "{{cards|" + handNotation.trim().replace(",", "|") + "}}";

	// save
	this.handNotation = handNotation;
	this.pokerNotation = pokerNotation;
	this.wikiSyntax = wikiSyntax;
	this.count = deck.size();
    }

    @Override
    public Iterator<Card> iterator() {
	return deck.iterator();
    }
}
