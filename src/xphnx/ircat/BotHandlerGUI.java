package xphnx.ircat;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotHandlerGUI extends JFrame {
	
	public BotHandlerGUI() {
		setTitle(RandomTitle());
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Panel
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		//Shut down button
		JButton quitButton = new JButton("Shut Down");
		quitButton.setBounds(355, 605, 325, 50);
		panel.add(quitButton);
		//Connect button
		JButton connectButton = new JButton("Connect");
		connectButton.setBounds(10, 605, 160, 50);
		panel.add(connectButton);
		//Disconnect button
		JButton disconnectButton = new JButton("Disconnect");
		disconnectButton.setBounds(175, 605, 160, 50);
		panel.add(disconnectButton);
	}

	private String RandomTitle() {
		/* Not yet functioning
		Random rn = new Random();
		return null;
		*/
		return "Hanley, here to serve you!";
	}

}
