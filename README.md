playingcards
============

Based on https://github.com/pffy/java-pokerdeck

Simple object-oriented package for building poker card decks in Java games.

### DEMO 1
```java

/**
 * Builds decks fast.
 */
// lists all 52 cards in hand notation
System.out.println(new PokerDeck());

/**
 * Shuffle cards.
 */
PokerDeck d = new PokerDeck();

// lists all 52 cards in hand notation
System.out.println(d);

// shuffle the deck
d.shuffleDeck();
System.out.println(d);

// list all 52 cards in poker notation
System.out.println(d.getPokerNotation());

// you can define a new Card with poker notation
System.out.println(new Card("2h").getPokerNotation());
  
// 10 (ten) of diamonds
System.out.println(new Card("Td").getWikiSyntax());
  
// queen of spades
System.out.println(new Card("Qs").getIcon());
  
// nine of clubs
System.out.println(new Card("9c").getColor());

  
// list all 52 cards in WikiSyntax
System.out.println(d.getWikiSyntax());

// 52
System.out.println(d.getCount());

/**
 * Deal cards.
 */

// a Card
System.out.println(d.drawTopCard());

// 51
System.out.println(d.getCount());

// two more Cards
System.out.println(d.drawTopCard());
System.out.println(d.drawTopCard());

// 49
System.out.println(d.getCount());

/**
 * Peek at the cards.
 */

// draws two cards, checking the suit or rank of each one
System.out.println(d.drawTopCard().getRank());
System.out.println(d.drawTopCard().getSuit());

// check the color, check the icon
System.out.println(d.drawTopCard().getColor());
System.out.println(d.drawTopCard().getIcon());
    
/**
 * Extract values for scoring while drawing cards.
 */

// draw three more cards
System.out.println(d.drawTopCard().getWikiSyntax());
System.out.println(d.drawTopCard().getPokerNotation());
System.out.println(d.drawTopCard().getHandNotation());


/**
 * Check the deck any time.
 */

// 42
System.out.println(d.getCount());
```

### DEMO 1 RESULTS
```
2c,3c,4c,5c,6c,7c,8c,9c,Tc,Jc,Qc,Kc,Ac,2d,3d,4d,5d,6d,7d,8d,9d,Td,Jd,Qd,Kd,Ad,2h,3h,4h,5h,6h,7h,8h,9h,Th,Jh,Qh,Kh,Ah,2s,3s,4s,5s,6s,7s,8s,9s,Ts,Js,Qs,Ks,As
2c,3c,4c,5c,6c,7c,8c,9c,Tc,Jc,Qc,Kc,Ac,2d,3d,4d,5d,6d,7d,8d,9d,Td,Jd,Qd,Kd,Ad,2h,3h,4h,5h,6h,7h,8h,9h,Th,Jh,Qh,Kh,Ah,2s,3s,4s,5s,6s,7s,8s,9s,Ts,Js,Qs,Ks,As
4c,9c,9d,As,9h,3s,Tc,6s,3d,Ac,4h,6c,Qc,Jh,2s,Ah,7h,Qs,Ad,Ks,Js,7c,8d,8c,Jd,5c,Jc,5h,Qh,Kd,2c,8h,Kc,Kh,8s,Th,4d,Qd,7d,9s,3c,4s,6h,2h,3h,2d,5s,6d,Td,7s,Ts,5d
4♣,9♣,9♦,A♠,9♥,3♠,T♣,6♠,3♦,A♣,4♥,6♣,Q♣,J♥,2♠,A♥,7♥,Q♠,A♦,K♠,J♠,7♣,8♦,8♣,J♦,5♣,J♣,5♥,Q♥,K♦,2♣,8♥,K♣,K♥,8♠,T♥,4♦,Q♦,7♦,9♠,3♣,4♠,6♥,2♥,3♥,2♦,5♠,6♦,T♦,7♠,T♠,5♦
2♥
{{cards|Td}}
♠
#000000
{{cards|4c|9c|9d|As|9h|3s|Tc|6s|3d|Ac|4h|6c|Qc|Jh|2s|Ah|7h|Qs|Ad|Ks|Js|7c|8d|8c|Jd|5c|Jc|5h|Qh|Kd|2c|8h|Kc|Kh|8s|Th|4d|Qd|7d|9s|3c|4s|6h|2h|3h|2d|5s|6d|Td|7s|Ts|5d}}
52
5d
51
Ts
7s
49
T
d
#000000
♦
{{cards|3h}}
2♥
6h
42
```


### REFERENCES

+ http://www.bicyclecards.com/about/bicycle-cards
+ http://www.pagat.com/poker/rules/ranking.html
+ http://www.unicode.org/charts/PDF/U1F0A0.pdf
+ http://en.wikipedia.org/wiki/Standard_52-card_deck
+ http://en.wikipedia.org/wiki/Wikipedia:WikiProject_Poker/Guidelines#Hand_notation


