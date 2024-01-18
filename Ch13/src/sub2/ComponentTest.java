package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtnum3;
	private JTextField txtnum4;
	private JTextField txtnum5;
	private JTextField txtnum6;
	private JTextField txtnum7;
	private JTextField txtnum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
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
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 155, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼 1을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭!!!");
			}
		});
		btn1.setBounds(12, 60, 71, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
			}
		});
		btn2.setBounds(95, 60, 71, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!!", "확인 대화 상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn3.setBounds(178, 60, 71, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트 필드");
		lblNewLabel_2.setBounds(12, 90, 79, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 115, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(51, 112, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUId = new JButton("확인");
		
		btnUId.setBounds(178, 111, 65, 23);
		frame.getContentPane().add(btnUId);
		
		JLabel lbresultUId = new JLabel("  결과 :");
		lbresultUId.setBounds(254, 115, 116, 15);
		frame.getContentPane().add(lbresultUId);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 144, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(51, 141, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		
		btnName.setBounds(178, 140, 65, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbresultName = new JLabel("  결과 :");
		lbresultName.setBounds(254, 144, 116, 15);
		frame.getContentPane().add(lbresultName);
		
		JLabel lblNewLabel_3_2 = new JLabel("휴대폰");
		lblNewLabel_3_2.setBounds(12, 175, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(51, 172, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		
		btnHp.setBounds(178, 171, 65, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbresultHp = new JLabel("  결과 :");
		lbresultHp.setBounds(254, 175, 168, 15);
		frame.getContentPane().add(lbresultHp);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("덧셈");
		lblNewLabel_3_2_1.setBounds(12, 204, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		txtnum1 = new JTextField();
		txtnum1.setColumns(10);
		txtnum1.setBounds(51, 201, 47, 21);
		frame.getContentPane().add(txtnum1);
		
		JButton btnPlus = new JButton("확인");
		
			
		btnPlus.setBounds(178, 200, 65, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbresultPlus = new JLabel("  결과 :");
		lbresultPlus.setBounds(254, 204, 168, 15);
		frame.getContentPane().add(lbresultPlus);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(120, 201, 47, 21);
		frame.getContentPane().add(txtnum2);
		txtnum2.setColumns(10);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("뺄셈");
		lblNewLabel_3_2_2.setBounds(12, 233, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_2);
		
		JButton btnMinus = new JButton("확인");
		
		btnMinus.setBounds(178, 229, 65, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbresultMinus = new JLabel("  결과 :");
		lbresultMinus.setBounds(254, 233, 168, 15);
		frame.getContentPane().add(lbresultMinus);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("곱셈");
		lblNewLabel_3_2_3.setBounds(12, 259, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_3);
		
		JButton btnMulti = new JButton("확인");
		
		btnMulti.setBounds(178, 255, 65, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbresultMulti = new JLabel("  결과 :");
		lbresultMulti.setBounds(254, 259, 168, 15);
		frame.getContentPane().add(lbresultMulti);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("나눗셈");
		lblNewLabel_3_2_4.setBounds(12, 288, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2_4);
		
		JButton btnDiv = new JButton("확인");
		
		btnDiv.setBounds(178, 284, 65, 23);
		frame.getContentPane().add(btnDiv);
		
		JLabel lbresultDiv = new JLabel("  결과 :");
		lbresultDiv.setBounds(254, 288, 168, 15);
		frame.getContentPane().add(lbresultDiv);
		
		txtnum3 = new JTextField();
		txtnum3.setColumns(10);
		txtnum3.setBounds(51, 229, 47, 21);
		frame.getContentPane().add(txtnum3);
		
		txtnum4 = new JTextField();
		txtnum4.setColumns(10);
		txtnum4.setBounds(120, 229, 47, 21);
		frame.getContentPane().add(txtnum4);
		
		txtnum5 = new JTextField();
		txtnum5.setColumns(10);
		txtnum5.setBounds(51, 257, 47, 21);
		frame.getContentPane().add(txtnum5);
		
		txtnum6 = new JTextField();
		txtnum6.setColumns(10);
		txtnum6.setBounds(120, 257, 47, 21);
		frame.getContentPane().add(txtnum6);
		
		txtnum7 = new JTextField();
		txtnum7.setColumns(10);
		txtnum7.setBounds(51, 282, 47, 21);
		frame.getContentPane().add(txtnum7);
		
		txtnum8 = new JTextField();
		txtnum8.setColumns(10);
		txtnum8.setBounds(120, 282, 47, 21);
		frame.getContentPane().add(txtnum8);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(105, 203, 14, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(105, 233, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setBounds(105, 259, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setBounds(105, 285, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5 = new JLabel("체크박스 실습");
		lblNewLabel_5.setBounds(12, 313, 86, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(4, 331, 65, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(72, 331, 65, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(141, 331, 65, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(210, 331, 65, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(282, 331, 65, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		
		btnCheck.setBounds(355, 331, 65, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("  결과 :");
		lbCheckResult.setBounds(12, 364, 168, 15);
		frame.getContentPane().add(lbCheckResult);
		
		
		//이벤트 리스너
		btnUId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//텍스트 필드에 입력한 문자열 가져오기
				String uid = txtUid.getText();
				
				//결과 라벨에 가져온 문자열 입력
				lbresultUId.setText(" 결과 :  " + uid);
				
			}
		});
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				
				lbresultName.setText(" 결과 :  " + name);
				
			}
		});
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				
				lbresultHp.setText(" 결과 :  " + hp);
			}
		});
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtnum1.getText());
				int num2 = Integer.parseInt(txtnum2.getText());
				
				int result = num1 + num2;
				lbresultPlus.setText(" 결과 :  "+result);
			
			
			}
		});
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txtnum3.getText());
				int num4 = Integer.parseInt(txtnum4.getText());
				
				int result = num3 - num4;
				lbresultMinus.setText(" 결과 :  "+result);
				
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num5 = Integer.parseInt(txtnum5.getText());
				int num6 = Integer.parseInt(txtnum6.getText());
				
				int result = num5 * num6;
				lbresultMulti.setText(" 결과 :  "+result);
				
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num7 = Integer.parseInt(txtnum7.getText());
				int num8 = Integer.parseInt(txtnum8.getText());
				
				double result = (double) num7 / num8;
				lbresultDiv.setText(" 결과 :  "+result);
			}
		});		
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				lbCheckResult.setText("결과 : " + cities);
			}
		});
	}
}
