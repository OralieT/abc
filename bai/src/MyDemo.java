
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyDemo extends JFrame{
	private JPanel panel;
	private JButton button;
	private JLabel lable;
	int count=0;
	public MyDemo() {
		
		setTitle("My Demo");
		setSize(300, 100);
		setLayout(new GridLayout(2,1));
		setBackground(Color.pink);
		addComps();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void addComps() {
		// create panle
				panel = new JPanel();
				button = new JButton("I'm a Swing button!");
				// add action on button
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						//process
						JButton event=(JButton) e.getSource();
						if(event.getText().equalsIgnoreCase(button.getText())) {
							System.out.println("accept button");
							count++;
							lable.setText("Number of button clicks : " + count);
						}
					}
				});
				//add button on panel
				panel.add(button);
				//create lable
				lable = new JLabel();
				//set text
				lable.setText("Number of button clicks : " + count);
				//add content panel of JFrame
				getContentPane().add(panel);
				getContentPane().add(lable);
	}
	
	public static void main(String[] args) {
		MyDemo demo = new MyDemo();
		demo.setVisible(true);
	}

}
