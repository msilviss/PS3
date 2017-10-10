package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import javax.smartcardio.Card;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	//TODO: Fix the Draw method so it throws an exception if the deck is empty
	
	public Card Draw() {
		return cardsInDeck.remove(0);
	}
	
	//TODO: Write an overloaded Draw method to Draw a card of a given eSuit
	
	public Card Draw(eSuit eSuit) {
		for (Card c: this.cardsInDeck) {
			if (c.geteSuit == eSuit)
				cardsInDeck.remove(c);
				return c;
		}
		return null;
	}
	
	//TODO: Write an overloaded Draw method to Draw a card of a given eRank
	
	public Card Draw(eRank eRank) {
		for (Card c: this.cardsInDeck) {
			if (c.geteRanke == eRank)
				cardsInDeck.remove(c);
				return c;
		}
		return null;
	}
	

	//TODO: Write a method that will return the number of a given eSuit left in the deck.
	
	public int CardCount (eSuit eSuit) {
		Card counteSuit = cardsInDeck.stream()                        
                .filter(x -> eSuit.equals(x.geteSuit()))        
                .findAny()                                      
                .orElse(null);                                  

        System.out.println(counteSuit);
				
	}
	
	//TODO: Write a method that will return the number of a given eRank left in the deck.
	
	public int CardCount (eRank eRank) {
		Card counteRank = cardsInDeck.stream()                        
                .filter(x -> eRank.equals(x.geteRank()))        
                .findAny()                                      
                .orElse(null);                                  

        System.out.println(counteRank);
				
	}
	
	
	//TODO: Write a method that will return 0 or 1 if a given card is left in the deck.
	
	public int FindCard(Card c) {
		for (Card crds: cardsInDeck) {
			if (crds == c)
				return 1;
		}
		return 0;
	}
}
