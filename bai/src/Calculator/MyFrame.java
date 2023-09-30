package Calculator;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("May Tinh");
		setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		getContentPane().add(new MyPanel());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
