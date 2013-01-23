package xphnx.ircat.bots.poker;

public class Hand {
	
	Player[] players = new Player[8];
	Card[] cards = new Card[16];
	int numofplayers = 0;
	boolean open = true;

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
	}

}
