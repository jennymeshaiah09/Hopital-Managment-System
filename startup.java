package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class startup implements ActionListener{
	JFrame frame;
	JPanel p1,p2;
	JLabel l1;
	JButton b1;
	startup(){
		frame = new JFrame("Survey Start up");
		p1  = new JPanel();
		p2  = new JPanel();
		l1 = new JLabel("****SUNSHINE HOSPITALS***");
		l1.setFont(new Font("Courier", Font.PLAIN, 32));
		b1 = new JButton("Click for appointment....");
		b1.setSize(80,50);
		
		b1.addActionListener(this);
		
		p1.add(l1);
		p1.setSize(500,250);
		p2.setSize(500,50);
		p2.add(b1);
		frame.add(p1);
		frame.add(p2);
		frame.setSize(700,300);
		frame.setLayout(new GridLayout(2,1));
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new Frame();
			
		}
		
	}
	public static void main(String args[]) {
		new startup();
	}
	
}