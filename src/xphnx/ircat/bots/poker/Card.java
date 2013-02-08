package xphnx.ircat.bots.poker;

import java.util.Random;

public class Card {
	
	int suit = (Integer) null;
	int numb = (Integer) null;
	Random rn = new Random();
	
	public void assign(Deck deck){
		for(boolean done = false; done == false;){
			suit = rn.nextInt(13) + 1;
			numb = rn.nextInt(4) + 1;
			if(deck.isInDeck(suit*numb)){
				deck.removeCard(suit*numb);
				done = true;
			}
		}
	}

}
