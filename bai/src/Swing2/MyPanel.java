package Swing2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Swing.MyPanel.TopPanel;

public class MyPanel extends JPanel {

	JPanel topPanel, centerPanel, botPanel;
	JTextField accnumTf, accnameTf, accmoneyTf;
	JButton btnadd, btnclear, btnexit;
	JLabel numberLb, nameLb, moneyLb;
	JTable table;

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
		public TopPanel() {
			setLayout(new BorderLayout());
			
			JPanel left = new JPanel();
			left.setLayout(new GridLayout(3,1));
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(3,1));
			
			numberLb = new JLabel("Account Number");
			nameLb = new JLabel("Account Name");
			moneyLb = new JLabel("Account Money");
			accnumTf = new JTextField();
			accnameTf = new JTextField();
			accmoneyTf = new JTextField();
			left.add(numberLb);
			left.add(nameLb);
			left.add(moneyLb);
			center.add(accnumTf);
			center.add(accnameTf);
			center.add(accmoneyTf);
			
			add(left, BorderLayout.WEST);
			add(center, BorderLayout.CENTER);
		}

	}

	public class CenterPanel extends JPanel {
		CenterPanel() {
			String [] title = { "Acc Number", "Acc Name", "Acc Money" };
			DefaultTableModel tableModel = new DefaultTableModel(title, 10);
			table = new JTable(tableModel);
			
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(0).setHeaderValue("Acc Number");
			columnModel.getColumn(1).setHeaderValue("Acc Name");
			columnModel.getColumn(2).setHeaderValue("Acc Money");
			
			JScrollPane scrollPane = new JScrollPane(table);
			add(scrollPane);
		}

	}

	public class BotPanel extends JPanel {
		BotPanel() {
			btnadd = new JButton("Add");
			btnadd.setMnemonic('A');
			btnclear = new JButton("Clear");
			btnclear.setMnemonic('C');
			btnexit = new JButton("Exit");
			btnexit.setMnemonic('E');
			add(btnadd);
			add(btnclear);
			add(btnexit);
		}
		
	}
}
