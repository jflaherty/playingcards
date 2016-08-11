/**
 * 
 * This package provides an implementation of the playingcards object model API used to build a standard 52 card deck using French playing cards.
 * 
 * The deck of 52 French playing cards is the most common deck of playing cards used today. It includes thirteen ranks of each of the 
 * four French suits: clubs (♣), diamonds (♦), hearts (♥) and spades (♠), with reversible "court" or face cards. Some modern designs, 
 * however, have done away with reversible face cards. Each suit includes an ace, depicting a single symbol of its suit; a king, queen, 
 * and jack, each depicted with a symbol of its suit; and ranks two through ten, with each card depicting that many symbols (pips) of 
 * its suit. Anywhere from one to four (most often two) Jokers, often distinguishable with one being more colorful than the other, are 
 * added to commercial decks, as some games require this extended deck. Modern playing cards carry index labels on opposite corners 
 * (rarely, all four corners) to facilitate identifying the cards when they overlap and so that they appear identical for players on 
 * opposite sides. The most popular stylistic pattern of the French Deck is sometimes referred to as "English" or "Anglo-American playing cards".
 * 
 * <h2>Card</h2>
 * <p>
 * Each of the below Enum types comprise the Card, which can possess any
 * combination of the pre-defined values.
 * 
 * <h2>Suit, SuitColor, SuitIcon and Rank</h2>
 * <p>
 * These classes takes advantage of Enum types (fast and not nullable). The
 * following are type Enum:
 * <ul>
 * <li>Suit</li>
 * <li>SuitColor</li>
 * <li>SuitIcon</li> 
 * <li>Rank</li>
 * </ul>
 * 
 * <h2>Deck</h2>
 * <p>
 * It provides flexibility for the creation of subsets of the French playing cards deck.
 * <ul>
 * <li>quarter deck (one suit)</li>
 * <li>half deck (two suits)</li>
 * <li>three-quarters deck (three suits)</li>
 * <li>full deck (all four suits)</li>
 * </ul>
 * 
 * @author Jay Flaherty
 * Based on work done by The Pffy Authors project, java-pokerdeck (https://github.com/pffy/java-pokerdeck)
 */
package com.github.jflaherty.cardgames.playingcards.french;