package Swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle ("Simple Paint");
		setSize (600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
