package com.hly.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent.EventType;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatorApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp frame = new CalculatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 */

	private double firstNumber = 0;
	private String operator = "";
	private double sqrt = 0;
	private double percent = 0;
	private double fraction = 0;
	private boolean isEqualsPress = false;

	public CalculatorApp() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(437, 10, 62, 13);
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 29, 489, 62);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 469, 42);
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(10, 101, 489, 255);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 5, 5));

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(245, 245, 220));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(245, 245, 220));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);

			}
		});
		panel_1.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(245, 245, 220));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn3);

		JButton btnDivice = new JButton("/");
		btnDivice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = "/";
				textField.setText("");
			}
		});
		btnDivice.setBackground(new Color(245, 245, 220));
		panel_1.add(btnDivice);

		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sqrt = Double.parseDouble(textField.getText());
				operator = "sqrt";
				sqrt = Math.sqrt(sqrt);
			
				
				
			}
			
		});
		btnSqrt.setBackground(new Color(245, 245, 220));
		panel_1.add(btnSqrt);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(245, 245, 220));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(245, 245, 220));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(245, 245, 220));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn6);

		JButton btnMulty = new JButton("*");
		btnMulty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = "*";
				textField.setText("");
			}
		});
		btnMulty.setBackground(new Color(245, 245, 220));
		panel_1.add(btnMulty);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = "%";
				percent = Double.parseDouble(textField.getText());
				percent = (percent / 100);
				
			}
		});
		btnPercent.setBackground(new Color(245, 245, 220));
		panel_1.add(btnPercent);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(245, 245, 220));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(245, 245, 220));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(245, 245, 220));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn9);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = "+";
				textField.setText("");
			}
		});
		btnAdd.setBackground(new Color(245, 245, 220));
		panel_1.add(btnAdd);

		JButton btnFraction = new JButton("1/x");
		btnFraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fraction = Double.parseDouble(textField.getText());
				fraction = 1/fraction;
				
			}
		});
		btnFraction.setBackground(new Color(245, 245, 220));
		panel_1.add(btnFraction);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(245, 245, 220));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsPress) {
					isEqualsPress = false;
					textField.setText("");
				}
				String cmd = e.getActionCommand();
				textField.setText(textField.getText() + cmd);
			}
		});
		panel_1.add(btn0);

		JButton btnPlus = new JButton("+/-");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					value = -value;
					textField.setText("" + value);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnPlus.setBackground(new Color(245, 245, 220));
		panel_1.add(btnPlus);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				isEqualsPress = false;
			}
		});
		btnClear.setBackground(new Color(245, 245, 220));
		panel_1.add(btnClear);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = "-";
				textField.setText("");
			}
		});
		btnSubtract.setBackground(new Color(245, 245, 220));
		panel_1.add(btnSubtract);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double secondNumber = Double.parseDouble(textField.getText());
				double result = 0;

				switch (operator) {
				case "+": 
					result = firstNumber + secondNumber;
					break;
				case "-":
					result = firstNumber - secondNumber;
					break;
				case "*":
					result = firstNumber * secondNumber;
					break;
				case "/":
					result = firstNumber / secondNumber;
					break;
				case "sqrt":
					result = sqrt;
					break;
				case "%":
					result = percent;
					break;
				case "1/x":
					result = fraction;
					break;
				
				
				}
				textField.setText("");
				textField.setText("" + result);
				isEqualsPress = true;

			}
		});

		btnEqual.setBackground(new Color(245, 245, 220));
		panel_1.add(btnEqual);
	}
}
