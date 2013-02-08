package xphnx.ircat;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

import xphnx.ircat.bots.poker.PokerBot;

public class Main {
	
	public static void main(String args[]) throws NickAlreadyInUseException, IOException, IrcException{
		//Start a new bot handler
		//BotHandler Hanley = new BotHandler();
		
		PokerBot pokerbot = new PokerBot("PokerShark");
		pokerbot.connect("irc.freenode.net");
		pokerbot.joinChannel("##poker");
		pokerbot.joinChannel("#xphnx");
	}

}
