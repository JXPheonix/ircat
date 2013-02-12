package xphnx.ircat.bots.clever;

import java.util.Random;
import org.jibble.pircbot.PircBot;
import com.google.code.chatterbotapi.*;

public class CleverBot extends PircBot {
	
	Random rn = null;
	int chance = 75; //Set this to the percentage chance that the bot does not talk
	ChatterBotFactory factory = null;
	ChatterBot bot = null;
	ChatterBotSession botsession = null;
	String reply = null;
	
	public CleverBot(String name){
		this.setName(name);
		factory = new ChatterBotFactory();
		try {
			bot = factory.create(ChatterBotType.CLEVERBOT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		botsession = bot.createSession();
		rn = new Random();
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		try {
			reply = botsession.think(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(((rn.nextInt(100))/100) > (chance/100)){
			sendMessage(channel, sender + reply);
		}
	}

}
