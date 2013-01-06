package xphnx.ircat;

import java.util.Random;

import javax.swing.JFrame;

public class BotHandlerGUI extends JFrame {
	
	public BotHandlerGUI() {
		setTitle(RandomTitle());
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private String RandomTitle() {
		/* Not yet functioning
		Random rn = new Random();
		return null;
		*/
		return "Hanley, here to serve you!";
	}

}
