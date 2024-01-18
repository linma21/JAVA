package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int operator = 0; //1:더하기, 2:빼기, 3:곱하기, 4:나누기
	private int num1 = 0;
	private int num2 = 0;
	private String strnum1 = "";
	private String strnum2 = "";
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(138, 154, 183));
		frame.setBounds(100, 100, 287, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 24));
		txtResult.setEditable(false);
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 247, 40);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		
		btn7.setBounds(12, 66, 54, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		
		btn8.setBounds(78, 66, 54, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		
		btn9.setBounds(144, 66, 54, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		
		btnDiv.setBounds(210, 66, 54, 60);
		frame.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		
		btn4.setBounds(12, 136, 54, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		
		btn5.setBounds(78, 136, 54, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		
		btn6.setBounds(144, 136, 54, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		
		btn1.setBounds(12, 206, 54, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		
		btn2.setBounds(78, 206, 54, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		
		btn3.setBounds(144, 206, 54, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnMulti = new JButton("x");
		
		btnMulti.setBounds(210, 136, 54, 60);
		frame.getContentPane().add(btnMulti);
		
		JButton btnMinus = new JButton("-");
		
		btnMinus.setBounds(210, 206, 54, 60);
		frame.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		
		btnPlus.setBounds(210, 276, 54, 60);
		frame.getContentPane().add(btnPlus);
		
		JButton btnEq = new JButton("=");
		
		btnEq.setBounds(144, 276, 54, 60);
		frame.getContentPane().add(btnEq);
		
		JButton btn0 = new JButton("0");
		
		btn0.setBounds(78, 276, 54, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnCancle = new JButton("c");
		
		btnCancle.setBounds(12, 276, 54, 60);
		frame.getContentPane().add(btnCancle);
		

		
		// 버튼 리스너
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "0";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "1";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "2";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "3";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "4";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "5";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "6";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "7";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "8";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strnum2 = "9";
				strnum1 = strnum1 + strnum2;
				
				if(operator == 0) {
				
				int num1 = Integer.parseInt(strnum1);
				
				}else {
				
				int num2 = Integer.parseInt(strnum1);
				
				}
				
				txtResult.setText(strnum1);
			}
		});
		
		
		
		// 연산자 버튼 리스너
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
				
			}
		});
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
			}
		});
		
		
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					 result = (int) ((double) num1 / num2) ;
				}
				txtResult.setText(""+result);
			}
		});
		
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
			
	}
}
