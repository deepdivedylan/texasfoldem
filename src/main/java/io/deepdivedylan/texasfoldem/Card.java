package io.deepdivedylan.texasfoldem;

public class Card {
	private Rank rank;
	private Suit suit;

	public Card(Rank newRank, Suit newSuit) {
		this.setRank(newRank);
		this.setSuit(newSuit);
	}

	public Rank getRank() {
		return(this.rank);
	}

	public void setRank(Rank newRank) {
		this.rank = newRank;
	}

	public Suit getSuit() {
		return(this.suit);
	}

	public void setSuit(Suit newSuit) {
		this.suit = newSuit;
	}

	public String toString() {
		return(this.rank.toString() + this.suit.toString());
	}
}
