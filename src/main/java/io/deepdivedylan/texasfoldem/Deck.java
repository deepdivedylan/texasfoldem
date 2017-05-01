package io.deepdivedylan.texasfoldem;

import org.apache.commons.math3.random.MersenneTwister;

public class Deck {
	private Card[] deck = null;

	public Deck() {
		this.deck = new Card[52];
		Integer i = 0;
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				this.deck[i] = new Card(rank, suit);
				i++;
			}
		}
	}

	public void shuffle() {
		MersenneTwister mersenneTwister = new MersenneTwister();
		Integer i = 0, length = this.deck.length;

		for(i = length - 1; i > 0; i++) {
			Integer j = mersenneTwister.nextInt(length);
			Card temp = this.deck[i];
			this.deck[i] = this.deck[j];
			this.deck[j] = temp;
		}
	}

	public String toString() {
		String output = "";
		String newline = System.lineSeparator();
		for(Card card : this.deck) {
			output = card + newline;
		}
		return(output);
	}
}
