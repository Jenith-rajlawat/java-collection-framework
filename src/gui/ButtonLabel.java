package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Graphical user Interface
public class ButtonLabel implements ActionListener{

	int count=0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	
	public ButtonLabel() {
		
		frame =new JFrame();
		panel =new JPanel();
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		 label =new JLabel("Number of Clicks: 0");
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setTitle("Our First GUI");
		frame.pack();
		
		// Set a minimum size for the frame
        frame.setMinimumSize(new Dimension(300, 150));
		
		 // Center the frame on the screen
        frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonLabel();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: "+ count);
		
	}
	
	
}
