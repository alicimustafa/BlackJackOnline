package com.mustafa.model;

public class GameCard {
	private static int count = 1;
	private int id;
	private Suits suit;
	private Ranks rank;

	public GameCard(Suits suit, Ranks rank) {
		super();
		this.id = count;
		this.suit = suit;
		this.rank = rank;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public Suits getSuit() {
		return suit;
	}

	public Ranks getRank() {
		return rank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameCard other = (GameCard) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GameCard [id=");
		builder.append(id);
		builder.append(", suit=");
		builder.append(suit);
		builder.append(", rank=");
		builder.append(rank);
		builder.append("]");
		return builder.toString();
	}
}
