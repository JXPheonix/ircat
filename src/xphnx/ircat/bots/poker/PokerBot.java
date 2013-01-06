package xphnx.ircat.bots.poker;

import org.jibble.pircbot.PircBot;

public class PokerBot extends PircBot {
	
	int numberofhands = 0;
	int numberofplayers = 0;
	Player[] players = new Player[(2^16 - 1)];
	String[] playnms = new String[(2^16 - 1)];
	
	public PokerBot(String name){
		this.setName(name);
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		//All the various onMessage checks
		if(message.equalsIgnoreCase(".poker")){
			//Start a new poker hand
		}else if(message.startsWith(".stats")){
			if(message.equalsIgnoreCase(".stats")){
				sendMessage(channel, "Number of hands played: " + Integer.toString(numberofhands));
				sendMessage(channel, "Number of players ever: " + Integer.toString(numberofplayers));
			}else{
				//Give player stats
			}
		}else if(message.equalsIgnoreCase(".iamnew")){
			numberofplayers++;
			players[numberofplayers] = new Player(sender);
			playnms[numberofplayers] = sender;
			sendMessage(channel, "Welcome! Your profile is linked to your nickname, so to make a new profile simply change your nick and type .iamnew again.");
		}
	}

}
