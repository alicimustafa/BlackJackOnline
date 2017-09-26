package com.mustafa.data;

import java.util.ArrayList;
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

	public void setDeck(List<GameCard> deck) {
		this.deck = deck;
		deckDelta = deck.size() /4;
	}
	
	
}
