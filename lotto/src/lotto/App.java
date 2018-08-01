package lotto;

import javax.swing.JFrame;

public class App {

	public static void main (String args[]) {
				
		FirstGui gui = new FirstGui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);
		gui.setTitle("Lotto Random Number Game");
	}
}
