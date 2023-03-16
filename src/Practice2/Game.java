package Practice2;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	ArrayList<Card> deck = new ArrayList<>();
	ArrayList<Player> players=new ArrayList<>();
	
	public Game(ArrayList<String> playerNames) {
		for (CardType type : CardType.values()) {
			for (int i = 1; i <= 13; i++) {
				deck.add(new Card(type, i));
			}
		}
		Collections.shuffle(deck);

		for (String name : playerNames) {
			players.add(new Player(name));
		}
	}

	public void dealCards(int numCards) {
		for (int i = 0; i < numCards; i++) {
			for (Player player : players) {
				Card card = deck.remove(0);
				player.cards.add(card);
			}
		}
	}

	public void playGame(String name) {
		if (name == "Trix" || name == "Tarneeb") {
			dealCards(13);
		} else if (name == "Baloot") {
			dealCards(8);
		} else {
			dealCards(13);
		}

		for (Player player : players) {
			player.printCard();
		}
	}
}
