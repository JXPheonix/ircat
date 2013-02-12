package xphnx.ircat;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

import xphnx.ircat.bots.poker.PokerBot;
import xphnx.ircat.bots.clever.CleverBot;

public class Main {
	
	public static void main(String args[]) throws NickAlreadyInUseException, IOException, IrcException{
		//Start a new bot handler
		//BotHandler Hanley = new BotHandler();
		
		CleverBot bot = new CleverBot("PokerShark");
		bot.connect("irc.freenode.net");
		bot.joinChannel("#xphnx");
	}

}
