package Swing2;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Account Manager");
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
