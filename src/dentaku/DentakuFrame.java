package dentaku;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DentakuFrame extends JFrame {

	public DentakuFrame() {

		JFrame frame = new JFrame("電卓ちゃん");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);

		JTextField textField = new JTextField(8);
		textField.setPreferredSize(new Dimension(300, 65));
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(textField, BorderLayout.NORTH);

		JPanel keyPanel = new JPanel();
		keyPanel.setLayout(new GridLayout(4, 4));
		contentPane.add(keyPanel, BorderLayout.CENTER);

		JButton button0 = new JButton("7");
		JButton button1 = new JButton("8");
		JButton button2 = new JButton("9");
		JButton button3 = new JButton("÷");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("×");
		JButton button8 = new JButton("1");
		JButton button9 = new JButton("2");
		JButton button10 = new JButton("3");
		JButton button11 = new JButton("-");
		JButton button12 = new JButton("0");
		JButton button13 = new JButton(".");
		JButton button14 = new JButton("=");
		JButton button15 = new JButton("+");

		keyPanel.add(button0);
		keyPanel.add(button1);
		keyPanel.add(button2);
		keyPanel.add(button3);
		keyPanel.add(button4);
		keyPanel.add(button5);
		keyPanel.add(button6);
		keyPanel.add(button7);
		keyPanel.add(button8);
		keyPanel.add(button9);
		keyPanel.add(button10);
		keyPanel.add(button11);
		keyPanel.add(button12);
		keyPanel.add(button13);
		keyPanel.add(button14);
		keyPanel.add(button15);

		frame.setVisible(true);

	}
}
