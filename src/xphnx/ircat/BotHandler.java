package xphnx.ircat;

public class BotHandler {
	
	BotHandlerGUI gui = null;
	
	public BotHandler() {
		gui();
	}

	public void inquire() {
		// TODO Auto-generated method stub
		
	}

	public void gui() {
		gui = new BotHandlerGUI();
		gui.setVisible(true);
		waitForConnect();
	}

	private void waitForConnect() {
		while(gui.connect == false){}
		connect();
		waitForDisconnect();
	}

	private void waitForDisconnect() {
		while(gui.connect){}
		disconnect();
		waitForConnect();
	}

	private void disconnect() {
		// TODO Auto-generated method stub
		
	}

	private void connect() {
		
	}

}
