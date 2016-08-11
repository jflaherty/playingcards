/**
 * 
 * Provides an object model API for building playing card decks.
 * 
 * This package contains basic ingredients for building card games with playing cards
 * 
 * <p>
 * <h2>IDeck</h2> This interface describes the actions for each Deck:
 * <p>
 * <ul>
 * <li>You can get the number of Cards in the deck.</li>
 * <li>You can shuffle the deck.</li>
 * <li>You can draw the top Card from the deck.</li>
 * <li><b>NOTE:</b> Empty deck throws an EmptyDeckException.
 * </ul>
 * 
 * <p>
 * <h2>ICard</h2> This interface describes the actions for each Card:
 * <p>
 * <ul>
 * <li>You can get the suit of a card.</li>
 * <li>You can get the rank of a card.</li>
 * <li>You can get the color of a suit.</li>
 * <li>You can get the the text icon of a suit.</li>
 * <li>You can get hand notation, poker notation, or WikiSyntax.</li> 
 * </ul>
 * 
 * <h2>ISuit, ISuitColor, ISuitIcon and IRank</h2>
 * <p>
 * This package takes advantage of Enum types (fast and not nullable). The
 * following are type Enum:
 * <ul>
 * <li>Suit</li>
 * <li>SuitColor</li>
 * <li>SuitIcon</li> 
 * <li>Rank</li>
 * </ul>
 * 
 * 
 * <h2>Card</h2>
 * <p>
 * Each of the above Enum types comprise the Card, which can possess any
 * combination of the pre-defined values.
 * 
 * <h2>Deck</h2>
 * <p>
 * It provides flexibility for the creation of subsets of the poker deck.
 * <ul>
 * <li>quarter deck (one suit)</li>
 * <li>half deck (two suits)</li>
 * <li>three-quarters deck (three suits)</li>
 * <li>full deck (all four suits)</li>
 * </ul>
 * 
 */
package com.github.jflaherty.cardgames.playingcards;