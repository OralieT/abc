package Swing3;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("Art Management");
		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();

	}
}
