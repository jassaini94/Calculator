package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double num1;
	double num2;
	double result;
	
	String operator;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.setBounds(100, 100, 216, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(5, 10, 206, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String backSpace = null;
				
				if(textField.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backSpace = strB.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnBackspace.setBounds(5, 55, 50, 50);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnClear.setBounds(57, 55, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnPercent.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPercent.setBounds(109, 55, 50, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDivide.setBounds(161, 55, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn7.setBounds(5, 107, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn8.setBounds(57, 107, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn9.setBounds(109, 107, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		btnMultiply.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnMultiply.setBounds(161, 107, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn4.setBounds(5, 159, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn5.setBounds(57, 159, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn6.setBounds(109, 159, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnSubtract.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnSubtract.setBounds(161, 159, 50, 50);
		frame.getContentPane().add(btnSubtract);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn1.setBounds(5, 211, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn2.setBounds(57, 211, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn3.setBounds(109, 211, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPlus.setBounds(161, 211, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btnDecimal.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDecimal.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDecimal.setBounds(5, 263, 50, 50);
		frame.getContentPane().add(btnDecimal);
			
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn0.setBounds(57, 263, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				num1 = Double.parseDouble(textField.getText());
				num1 = num1 * (-1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnPlusMinus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPlusMinus.setBounds(109, 263, 50, 50);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				
				num2 = Double.parseDouble(textField.getText());
				
				if(operator == "+")
				{
					result = num1 + num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "-")
				{
					result = num1 - num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "*")
				{
					result = num1 * num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "/")
				{
					result = num1 / num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operator == "%")
				{
					result = num1 % num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnEqual.setBounds(161, 263, 50, 50);
		frame.getContentPane().add(btnEqual);
	}
}
