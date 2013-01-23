package xphnx.ircat.bots.poker;

public class Player {
	
	String playerlogin;
	int numberofhands = 0;
	int wins = 0;
	int lose = 0;

	public Player(String login) {
		playerlogin = login;
	}
	
	public double getWinLoseRatio(){
		double wlr = wins/lose;
		return wlr;
	}

}
