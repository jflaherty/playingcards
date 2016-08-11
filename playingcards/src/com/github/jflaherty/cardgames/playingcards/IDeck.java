package com.github.jflaherty.cardgames.playingcards;

import com.github.jflaherty.cardgames.playingcards.exceptions.EmptyDeckException;
import com.github.jflaherty.cardgames.playingcards.french.Card;

public interface IDeck {

    public int getCount();

    public void shuffleDeck();

    public Card drawTopCard() throws EmptyDeckException;

}
