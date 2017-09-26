package com.mustafa.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mustafa.model.GameCard;
import com.mustafa.model.Ranks;
import com.mustafa.model.Suits;

public class DealerShoeTest {
	
	DealarShoe shoe;
	GameCard[] deck = {
			new GameCard(Suits.CLUB, Ranks.ACE),
			new GameCard(Suits.CLUB, Ranks.EIGHT),
			new GameCard(Suits.CLUB, Ranks.FIVE),
			new GameCard(Suits.CLUB, Ranks.JACK),
			new GameCard(Suits.CLUB, Ranks.TWO),
			new GameCard(Suits.CLUB, Ranks.KING),
			new GameCard(Suits.CLUB, Ranks.SEVEN),
			new GameCard(Suits.CLUB, Ranks.THREE),
			new GameCard(Suits.CLUB, Ranks.FOUR),
			new GameCard(Suits.CLUB, Ranks.QUEEN),
			new GameCard(Suits.CLUB, Ranks.NINE),
			new GameCard(Suits.CLUB, Ranks.SIX)
			};

	@Before
	public void setUp() throws Exception {
		shoe = new DealarShoe();
		List<GameCard> d = new ArrayList<>();
		for (GameCard gameCard : deck) {
			d.add(gameCard);
		}
		shoe.setDeck(d);
	}

	@After
	public void tearDown() throws Exception {
		shoe = null;
	}

	@Test
	public void smoke_test() {
		assertEquals(true,true);
	}
	
	@Test 
	public void test_setDeck_set_the_correct_delta() {
		assertEquals(3 , shoe.getDeckDelta());
	}
	
	@Test
	public void test_drawCard_returns_card_and_reduces_size_of_deck() {
		assertTrue(shoe.drawCard() instanceof GameCard);
		assertEquals(11, shoe.getDeck().size());
	}

}
