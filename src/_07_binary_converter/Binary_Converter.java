package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	static JButton JButton = new JButton();
	static JFrame JFrame = new JFrame();
	static JPanel JPanel = new JPanel();
	static JTextField JTextField = new JTextField();
	public static void main(String[] args) {
JFrame.setVisible(true);
JPanel.setVisible(true);
JTextField.setVisible(true);
JFrame.setTitle("Convert 8 bits of binary to ASCII");
JButton.setText("convert");
JTextField answer = new JTextField(20);
JPanel.add(JTextField);
JPanel.add(answer);
JPanel.add(JButton);
JFrame.add(JPanel);
JFrame.pack();
}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary");
	        return "-";
	    }
	}
void actionlister() {
JButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {	
}
} 
