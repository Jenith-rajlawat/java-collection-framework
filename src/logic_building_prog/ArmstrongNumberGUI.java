package logic_building_prog;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArmstrongNumberGUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField inputField;
    private JButton checkButton;

    public ArmstrongNumberGUI() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Enter a number to check if Armstrong:");
        inputField = new JTextField();
        checkButton = new JButton("Check Armstrong");
        checkButton.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(inputField);
        panel.add(checkButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Armstrong Number Checker");
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (ArmstrongNumber.isArmStrongNumber(num)) {
                label.setText("It is an Armstrong number");
            } else {
                label.setText("It is not an Armstrong number");
            }
        } catch (NumberFormatException ex) {
            label.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new ArmstrongNumberGUI();
    }
}
