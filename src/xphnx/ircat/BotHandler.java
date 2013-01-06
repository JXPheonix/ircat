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
		while(gui.connect == false){
			//Wait!
		}
		connect();
	}

	private void connect() {
		
	}

}
