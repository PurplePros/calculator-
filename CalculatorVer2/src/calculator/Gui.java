package calculator;

import java.awt.EventQueue;
import calculator.Calculator; 
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Gui {

	private JFrame frame;
	public static String equation = "";
	public static String eqLabel = "";
	public static double result = 0; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					JFrame errorMessage = new JFrame();
					errorMessage.setBounds(100, 100, 200, 200);
					errorMessage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					errorMessage.getContentPane().setLayout(null);
					JLabel error = new JLabel("Invalid operation! Try again!");
					errorMessage.setFont(new Font("Ebrima", Font.PLAIN, 40));
					errorMessage.setBounds(38, 51, 100, 100);
					errorMessage.getContentPane().add(error);
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { 
		
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 673, 862);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel output = new JLabel("");
		output.setFont(new Font("Ebrima", Font.PLAIN, 40));
		output.setOpaque(true);
		output.setBackground(Color.WHITE);
		output.setBounds(38, 51, 560, 108);
		frame.getContentPane().add(output);
		
		JButton button1 = new JButton("1");
		button1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button1.setBounds(38, 550, 100, 100);
		frame.getContentPane().add(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "1";
				eqLabel += "1";
				output.setText(eqLabel);
			}
		});
		
		JButton button0 = new JButton("0");
		button0.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button0.setBounds(38, 666, 100, 100);
		frame.getContentPane().add(button0);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "0";
				eqLabel += "0";
				output.setText(eqLabel);
			}
		});
		
		JButton buttonDot = new JButton(".");
		buttonDot.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonDot.setBounds(153, 666, 100, 100);
		frame.getContentPane().add(buttonDot);
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += ".";
				eqLabel += ".";
				output.setText(eqLabel);
			}
		});
		JButton buttonNeg = new JButton("(-)");
		buttonNeg.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonNeg.setBounds(268, 666, 100, 100);
		frame.getContentPane().add(buttonNeg);
		buttonNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "-";
				eqLabel += "-";
				output.setText(eqLabel);
			}
		});
		
		JButton button2 = new JButton("2");
		button2.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button2.setBounds(153, 550, 100, 100);
		frame.getContentPane().add(button2);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "2";
				eqLabel += "2";
				output.setText(eqLabel);
			}
		});
		
		JButton button3 = new JButton("3");
		button3.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button3.setBounds(268, 550, 100, 100);
		frame.getContentPane().add(button3);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "3";
				eqLabel += "3";
				output.setText(eqLabel);
			}
		});
		
		JButton button4 = new JButton("4");
		button4.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button4.setBounds(38, 434, 100, 100);
		frame.getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "4";
				eqLabel += "4";
				output.setText(eqLabel);
			}
		});
		
		JButton button5 = new JButton("5");
		button5.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button5.setBounds(153, 434, 100, 100);
		frame.getContentPane().add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "5";
				eqLabel += "5";
				output.setText(eqLabel);
			}
		});
		
		JButton button6 = new JButton("6");
		button6.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button6.setBounds(268, 434, 100, 100);
		frame.getContentPane().add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "6";
				eqLabel += "6";
				output.setText(eqLabel);
			}
		});
		
		JButton button7 = new JButton("7");
		button7.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button7.setBounds(38, 318, 100, 100);
		frame.getContentPane().add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "7";
				eqLabel += "7";
				output.setText(eqLabel);
			}
		});
		
		JButton button8 = new JButton("8");
		button8.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button8.setBounds(153, 318, 100, 100);
		frame.getContentPane().add(button8);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "8";
				eqLabel += "8";
				output.setText(eqLabel);
			}
		});
		
		JButton button9 = new JButton("9");
		button9.setFont(new Font("Arial Black", Font.PLAIN, 24));
		button9.setBounds(268, 318, 100, 100);
		frame.getContentPane().add(button9);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += "9";
				eqLabel += "9";
				output.setText(eqLabel);
			}
		});
		
		JButton buttonOpenParen = new JButton("(");
		buttonOpenParen.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonOpenParen.setBounds(383, 318, 100, 100);
		frame.getContentPane().add(buttonOpenParen);
		buttonOpenParen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += " ( ";
				eqLabel += "(";
				output.setText(eqLabel);
			}
		});
		
		JButton buttonClosedParen = new JButton(")");
		buttonClosedParen.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonClosedParen.setBounds(498, 318, 100, 100);
		frame.getContentPane().add(buttonClosedParen);
		buttonClosedParen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += " ) ";
				eqLabel += ")";
				output.setText(eqLabel);
			}
		});
		
		JButton buttonMult = new JButton("x");
		buttonMult.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonMult.setBounds(383, 434, 100, 100);
		frame.getContentPane().add(buttonMult);
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equation.equals("")) {
					equation = Double.toString(result) + " * ";
					output.setText("ANS*");
					eqLabel = "ANS*";
				}
				else {
					equation += " * ";
					eqLabel += "*";
					output.setText(eqLabel);
				}
			}
		});
		
		JButton buttonDivide = new JButton("\u00F7");
		buttonDivide.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonDivide.setBounds(498, 434, 100, 100);
		frame.getContentPane().add(buttonDivide);
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equation.equals("")) {
					equation = Double.toString(result) + " / ";
					output.setText("ANS÷");
					eqLabel = "ANS÷";
				}
				else {
					equation += " / ";
					eqLabel += "÷";
					output.setText(eqLabel);
				}
			}
		});
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonAdd.setBounds(383, 550, 100, 100);
		frame.getContentPane().add(buttonAdd);
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equation.equals("")) {
					equation = Double.toString(result) + " + ";
					output.setText("ANS+");
					eqLabel = "ANS+";
				}
				else {
					equation += " + ";
					eqLabel += "+";
					output.setText(eqLabel);
				}
			}
		});
		
		JButton buttonSub = new JButton("-");
		buttonSub.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonSub.setBounds(498, 550, 100, 100);
		frame.getContentPane().add(buttonSub);
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equation.equals("")) {
					equation = Double.toString(result) + " - ";
					output.setText("ANS-");
					eqLabel = "ANS-";
				}
				else {
					equation += " - ";
					eqLabel += "-";
					output.setText(eqLabel);
				}
			}
		});
		
		JButton buttonAns = new JButton("ANS");
		buttonAns.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonAns.setBounds(383, 666, 100, 100);
		frame.getContentPane().add(buttonAns);
		buttonAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation += Double.toString(result);
				eqLabel += "ANS";
				output.setText(eqLabel);
			}
		});
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonEqual.setBounds(498, 666, 100, 100);
		frame.getContentPane().add(buttonEqual);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Calculator.calculatePostExp(Calculator.convertInfix(Calculator.splitExp(equation)));
				equation = "";
				eqLabel = "";
				output.setText(Double.toString(result));
			}
		});
		
		JButton btnDel = new JButton("DEL");
		btnDel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		btnDel.setBounds(153, 202, 100, 100);
		frame.getContentPane().add(btnDel);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation = equation.substring(0, equation.length()-1);
				eqLabel = equation.substring(0, eqLabel.length()-1);
				output.setText(eqLabel);
			}
		});
		
		JButton buttonCLR = new JButton("CLR");
		buttonCLR.setFont(new Font("Arial Black", Font.PLAIN, 24));
		buttonCLR.setBounds(38, 202, 100, 100);
		frame.getContentPane().add(buttonCLR);
		buttonCLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation = "";
				eqLabel = "";
				output.setText(eqLabel);
			}
		});

	}
}
