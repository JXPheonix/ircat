package xphnx.ircat;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BotHandlerGUI extends JFrame implements ActionListener {
	
	public boolean connect = false;
	public String channel = null;
	public String network = null;
	public String bot = null;
	
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
		quitButton.setBounds(355, 605, 320, 50);
		panel.add(quitButton);
		//Connect button
		JButton connectButton = new JButton("Connect");
		connectButton.setBounds(10, 605, 160, 50);
		panel.add(connectButton);
		//Disconnect button
		JButton disconnectButton = new JButton("Disconnect");
		disconnectButton.setBounds(175, 605, 160, 50);
		panel.add(disconnectButton);
		//Bot selection radio buttons
		//PokerBot select
		JRadioButton pokerRadioButton = new JRadioButton("Poker");
		pokerRadioButton.setActionCommand("p");
		//Werewolf select
		JRadioButton werewRadioButton = new JRadioButton("Werewolf");
		werewRadioButton.setActionCommand("w");
		//Group the buttons
		ButtonGroup botSelectGroup = new ButtonGroup();
		botSelectGroup.add(pokerRadioButton);
		botSelectGroup.add(werewRadioButton);
		//Listeners
		pokerRadioButton.addActionListener(this);
		//Give them their own panel
		JPanel botSelectPanel = new JPanel(new GridLayout(0, 1));
		botSelectPanel.add(pokerRadioButton);
		botSelectPanel.add(werewRadioButton);
		//Add the panel back into the main panel
		botSelectPanel.setBounds(10, 40, 200, 30);
		panel.add(botSelectPanel);
		//Channel input box
		
		//Network input box
		
	}

	private String RandomTitle() {
		/* Not yet functioning
		Random rn = new Random();
		return null;
		*/
		return "ircat, here to serve you!";
	}
	
	public void actionPerformed(ActionEvent e){
		bot = e.getActionCommand();
	}

}
