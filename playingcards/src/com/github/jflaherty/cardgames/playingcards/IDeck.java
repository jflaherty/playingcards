package com.github.wsppan.cardgames.playingcards;

import com.github.wsppan.cardgames.playingcards.exceptions.EmptyDeckException;
import com.github.wsppan.cardgames.playingcards.french.Card;

public interface IDeck {

    public int getCount();

    public void shuffleDeck();

    public Card drawTopCard() throws EmptyDeckException;

}
