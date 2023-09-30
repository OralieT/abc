package Swing3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
	JPanel topPanel, centerPanel, botPanel;
	JTextField tttTf, nstTf;
	JLabel tttLb, nstLb, ltLb, pcLb, tgLb, qlLb;
	JButton btnt, btnsx;

	MyPanel() {
		setLayout(new BorderLayout());
		topPanel = new TopPanel();
		centerPanel = new CenterPanel();
		botPanel = new BotPanel();

		add(topPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(botPanel, BorderLayout.SOUTH);
	}

	public class TopPanel extends JPanel {
		TopPanel() {
			qlLb = new JLabel("QUAN LY TAC PHAM HOI HOA"); 
			add(qlLb);

		}
	}

	public class CenterPanel extends JPanel {
		CenterPanel() {
			JPanel left = new JPanel();
			left.setLayout(new GridLayout(5, 1));
			JPanel cen = new JPanel();
			cen.setLayout(new GridLayout(5,1));
			
			tttLb = new JLabel("Ten tac pham");
			nstLb = new JLabel("Nam sang tac");
			ltLb = new JLabel("Loai tranh");
			

			left.add(tttLb);
			left.add(nstLb);
			left.add(ltLb);
			
			add(left, BorderLayout.WEST);
			add(cen, BorderLayout.CENTER);
		}
	}

	public class BotPanel extends JPanel {

	}
}
