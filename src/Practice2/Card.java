package Practice2;

public class Card {
	 CardType type;
	 int number;

	public Card(CardType typ, int cardnum) {
		type = typ;
		number = cardnum;
	}
	

	public String toString() {
		return number + " / " + type;
	}
}
