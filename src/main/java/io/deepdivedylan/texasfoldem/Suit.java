package io.deepdivedylan.texasfoldem;

public enum Suit {
	CLUBS,
	DIAMONDS,
	HEARTS,
	SPADES;

	public String toString() {
		switch(this) {
			case CLUBS:
				return("c");
			case DIAMONDS:
				return("d");
			case HEARTS:
				return("h");
			case SPADES:
				return("s");
			default:
				return("");
		}
	}
}
