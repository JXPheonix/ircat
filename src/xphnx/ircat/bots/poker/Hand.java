package xphnx.ircat.bots.poker;

public class Hand {
	
	Player[] players = new Player[8];
	Card[] cards = new Card[16];
	Card[] publicCards = new Card[5];
	Deck deck = new Deck();
	int numofplayers = 0;
	boolean open = true;
	int pot = 0;

	public void add(Player profile) {
		players[numofplayers] = profile;
		numofplayers++;
	}
	
	public void start(){
		if(numofplayers < 7){
			for(int i = numofplayers; i > 6; i++){
				players[i] = null;
			}
		}
		open = false;
		deck.shuffle();
		for(int i = 0; i < 16; i++){
			cards[i] = deck.takeCard();
		}
		round();
		for(int i = 0; i < 3; i++){
			publicCards[i] = deck.takeCard();
		}
		showCards();
		round();
		publicCards[3] = deck.takeCard();
		showCards();
		round();
		publicCards[4] = deck.takeCard();
		showCards();
		round();
		conclusion();
	}
	
	private void conclusion() {
		// TODO Auto-generated method stub
		
	}

	private void showCards() {
		// TODO Auto-generated method stub
		
	}

	public void round(){
		for(int i = 0; i < numofplayers; i++){
			
		}
	}

}
