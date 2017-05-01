package io.deepdivedylan.texasfoldem;

public enum Rank {
	DEUCE(2),
	TREY(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);

	private final Integer rank;

	Rank(Integer newRank) {
		this.rank = newRank;
	}

	public String toString() {
		switch(this) {
			case DEUCE:
			case TREY:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				return(String.valueOf(this.rank));
			case TEN:
				return("T");
			case JACK:
				return("J");
			case QUEEN:
				return("Q");
			case KING:
				return("K");
			case ACE:
				return("A");
			default:
				return("");
		}
	}
}
