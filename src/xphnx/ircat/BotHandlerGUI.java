package xphnx.ircat;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class BotHandlerGUI extends JFrame implements ActionListener {
	
	public boolean connect = false;
	public String channel = null;
	public String network = null;
	public String bot = null;
	//Important stuff lies ahead!
	JButton connectButton = null;
	JButton disconnectButton = null;
	
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
		connectButton = new JButton("Connect");
		connectButton.setBounds(10, 605, 160, 50);
		connectButton.setActionCommand("Connect");
		panel.add(connectButton);
		//Disconnect button
		disconnectButton = new JButton("Disconnect");
		disconnectButton.setBounds(175, 605, 160, 50);
		disconnectButton.setEnabled(false);
		disconnectButton.setActionCommand("Disconnect");
		panel.add(disconnectButton);
		//Bot selection radio buttons
		//PokerBot select
		JRadioButton pokerRadioButton = new JRadioButton("Poker");
		pokerRadioButton.setActionCommand("SetBotToPokerBot");
		//Werewolf select
		JRadioButton werewRadioButton = new JRadioButton("Werewolf");
		werewRadioButton.setActionCommand("SetBotToWereWBot");
		//Group the buttons
		ButtonGroup botSelectGroup = new ButtonGroup();
		botSelectGroup.add(pokerRadioButton);
		botSelectGroup.add(werewRadioButton);
		//Give them their own panel
		JPanel botSelectPanel = new JPanel(new GridLayout(0, 1));
		botSelectPanel.add(pokerRadioButton);
		botSelectPanel.add(werewRadioButton);
		//Add the panel back into the main panel
		botSelectPanel.setBounds(10, 40, 200, 30);
		panel.add(botSelectPanel);
		//Channel input box
		JTextField channelInputField = new JTextField("Channel Input");
		channelInputField.setBounds(355, 60, 150, 20);
		channelInputField.setActionCommand("ChannelInputCommand");
		panel.add(channelInputField);
		//Network input box
		JTextField networkInputField = new JTextField("Network Input");
		networkInputField.setBounds(355, 30, 150, 20);
		networkInputField.setActionCommand("NetworkInputCommand");
		panel.add(networkInputField);
		//Listeners
		connectButton.addActionListener(this);
		disconnectButton.addActionListener(this);
		pokerRadioButton.addActionListener(this);
		werewRadioButton.addActionListener(this);
		channelInputField.addActionListener(this);
		networkInputField.addActionListener(this);
	}

	private String RandomTitle() {
		/* Not yet functioning
		Random rn = new Random();
		return null;
		*/
		return "ircat, here to serve you!";
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "SetBotToPokerBot"){
			bot = "PokerBot";
		}else if(e.getActionCommand() == "SetBotToWereWBot"){
			bot = "WereWBot";
		}else if(e.getActionCommand() == "ChannelInputCommand"){
			channel = ((JTextField) e.getSource()).getText();
		}else if(e.getActionCommand() == "NetworkInputCommand"){
			network = ((JTextField) e.getSource()).getText();
		}else if(e.getActionCommand() == "Connect"){
			connect = true;
			disconnectButton.setEnabled(true);
			connectButton.setEnabled(false);
		}else if(e.getActionCommand() == "Disconnect"){
			connect = false;
			connectButton.setEnabled(true);
			disconnectButton.setEnabled(false);
		}
	}

}
