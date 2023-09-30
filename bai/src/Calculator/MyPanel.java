package Calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
    JPanel subPanel;
	JTextField textField;

	public MyPanel() {
		setLayout(new BorderLayout());

		setTextField();

		add(new SubPanel(), BorderLayout.CENTER);

	}

	private void setTextField() {
		// TODO Auto-generated method stub
		textField = new JTextField("0");
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setEditable(false);
		textField.setPreferredSize(new Dimension(0, 30));
		textField.setFont(new Font(null, 0, 17));
		add(textField, BorderLayout.NORTH);

	}

	class SubPanel extends JPanel {
		JButton btn;
		ActionListener btnAction1;
		public SubPanel() {
			setLayout(new GridLayout(5, 4));
		
		createButton1();
		}
		
		
		private void createButton1() {
			// Hang 1
			btn = new JButton("DELL");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("DELL");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("C");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("C");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("ON");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("ON");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("OFF");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("OFF");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hang 2
			btn = new JButton("7");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("7");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("8");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("8");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("9");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("9");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton(":");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand(":");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hang 3
			btn = new JButton("4");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("4");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("5");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("5");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("6");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("6");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("x");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("x");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hang 4
			btn = new JButton("1");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("1");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("2");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("2");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("3");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("3");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("-");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("-");
			btn.addActionListener(btnAction1);
			add(btn);

			// Hang 5
			btn = new JButton("0");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("0");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton(".");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand(".");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("=");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("=");
			btn.addActionListener(btnAction1);
			add(btn);

			btn = new JButton("+");
			btn.setFont(new Font(null, 0, 15));
			btn.setActionCommand("+");
			btn.addActionListener(btnAction1);
			add(btn);
		}

	}

}
