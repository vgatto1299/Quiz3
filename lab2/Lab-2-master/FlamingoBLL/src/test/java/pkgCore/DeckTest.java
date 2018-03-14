package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		Deck deck = new Deck(1);
		assertEquals(52,deck.Cards.size());
		
		Deck deck2 = new Deck(6);
		assertEquals(312, deck2.Cards.size());
	}

}
