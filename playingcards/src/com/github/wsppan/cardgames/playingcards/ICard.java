package com.github.wsppan.cardgames.playingcards;

public interface ICard {

    public String getHandNotation();

    public String getPokerNotation();

    public String getWikiSyntax();

    public ISuit getSuit();

    public IRank getRank();

}
