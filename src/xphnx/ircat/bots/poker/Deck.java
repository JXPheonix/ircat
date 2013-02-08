package xphnx.ircat.bots.poker;

public class Deck {
	
	boolean[] deck = new boolean[52];
	Card[] cards = new Card[52];
	int give = -1;
	
	public Deck(){
		for(int i = 0; i < 52; i++){
			deck[i] = true;
		}
	}
	
	public void removeCard(int toRemove){
		deck[toRemove] = false;
	}
	
	public boolean isInDeck(int toCheck){
		return deck[toCheck];
	}
	
	public void shuffle(){
		for(int i = 0; i < 52; i++){
			cards[i].assign(this);
		}
	}
	
	public Card takeCard(){
		give++;
		return cards[give];
	}

}
