package com.mustafa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mustafa.model.GameCard;

public class DealarShoe {

	private List<GameCard> deck;
	private int deckDelta;

	public DealarShoe() {
		deck = new ArrayList<>();
	}

	public List<GameCard> getDeck() {
		return deck;
	}

	public int getDeckDelta() {
		return deckDelta;
	}

	public void setDeck(List<GameCard> deck) {
		this.deck = deck;
		Collections.shuffle(this.deck);
		this.deckDelta = deck.size() / 4;
	}
	
	public GameCard drawCard() {
		return deck.remove(0);
	}

}
