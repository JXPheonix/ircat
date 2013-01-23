package xphnx.ircat.bots.poker;

import org.jibble.pircbot.PircBot;

public class PokerBot extends PircBot {
	
	int numberofhands = 0;
	int numberofplayers = 0;
	Player[] players = new Player[(2^16 - 1)];
	String[] playnms = new String[(2^16 - 1)];
	Hand chand = null;
	
	public PokerBot(String name){
		this.setName(name);
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		//All the various onMessage checks
		if(message.equalsIgnoreCase(".poker")){
			chand = new Hand();
			sendMessage(channel, "A new game is starting!");
			chand.add(getProfile(sender));
			sendMessage(channel, sender + " has joined the game!");
		}else if(message.startsWith(".stats")){
			if(message.equalsIgnoreCase(".stats")){
				sendMessage(channel, "Number of hands played: " + Integer.toString(numberofhands));
				sendMessage(channel, "Number of players ever: " + Integer.toString(numberofplayers));
			}else{
				sendMessage(channel, "Not yet implemented");
			}
		}else if(message.equalsIgnoreCase(".iamnew")){
			if(hasProfile(sender)){
				sendMessage(channel, "You already have a profile!");
			}else{
				numberofplayers++;
				players[numberofplayers] = new Player(sender);
				playnms[numberofplayers] = sender;
				sendMessage(channel, "Welcome! Your profile is linked to your nickname, so to make a new profile simply change your nick and type .iamnew again.");
			}
		}else if(message.equalsIgnoreCase(".join")){
			if(chand == null){
				sendMessage(channel, "No game is currently running! Try .poker");
			}else if(chand.open){
				if(hasProfile(sender)){
					chand.add(getProfile(sender));
					sendMessage(channel, sender + " has joined the game!");
				}else{
					sendMessage(channel, "Please type .iamnew to make a profile!");
				}
			}else{
				sendMessage(channel, "Game has already started");
			}
		}else if(message.equalsIgnoreCase(".start")){
			sendMessage(channel, ".start placeholder");
		}else if(message.startsWith(".b")){
			sendMessage(channel, ".bid placeholder");
		}else if(message.startsWith(".c")){
			sendMessage(channel, ".check placeholder");
		}
	}

	private boolean hasProfile(String sender) {
		for(int i = 0; i < (2^16); i++){
			if(playnms[i] == sender){
				return true;
			}
		}
		return false;
	}
	
	private Player getProfile(String sender){
		for(int i = 0; i < (2^16); i++){
			if(playnms[i] == sender){
				return players[i];
			}
		}
		return null;
	}

}
