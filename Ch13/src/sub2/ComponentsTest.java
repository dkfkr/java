package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField textHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 0, 168, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setFont(new Font("굴림", Font.ITALIC, 16));
		btn1.setBounds(12, 61, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭..."); 
			}
		});
		btn2.setFont(new Font("굴림", Font.ITALIC, 16));
		btn2.setBounds(121, 61, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn4 = new JButton("확인3");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(btn4, "버튼 3클릭..","확인대상자", JOptionPane.YES_NO_OPTION);
					if(answer == 0) {
						System.out.println("yes click...");
					}else {
						System.err.println("no click...");
					}
			}
		});
		btn4.setFont(new Font("굴림", Font.ITALIC, 16));
		btn4.setBounds(228, 61, 97, 23);
		frame.getContentPane().add(btn4);
		
		txtUid = new JTextField();
		txtUid.setBounds(80, 130, 136, 23);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(337, 138, 200, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(337, 170, 211, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(337, 204, 211, 15);
		frame.getContentPane().add(lbHp);
		
		JLabel lblNewLabel_1 = new JLabel("Textfield Test");
		lblNewLabel_1.setBounds(12, 109, 97, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("button Test");
		lblNewLabel_1_1.setBounds(12, 41, 97, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(22, 134, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnUid = new JButton("획인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 :" + uid);
			}
		});
		btnUid.setBounds(228, 130, 97, 23);
		frame.getContentPane().add(btnUid);
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setBounds(22, 170, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel TxtHp = new JLabel("휴대폰");
		TxtHp.setBounds(22, 204, 57, 15);
		frame.getContentPane().add(TxtHp);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(80, 166, 136, 23);
		frame.getContentPane().add(txtName);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(80, 200, 136, 23);
		frame.getContentPane().add(textHp);
		
		JButton btnName = new JButton("획인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =  txtName.getText();
				lbName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(228, 167, 97, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("획인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp1 =  textHp.getText();
				lbHp.setText("결과 : " + hp1);
			}
		});
		btnHp.setBounds(228, 200, 97, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_3 = new JLabel("check box Test");
		lblNewLabel_3.setBounds(12, 255, 97, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 286, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(80, 286, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(141, 286, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(238, 324, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(317, 324, 57, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 :");
		lbChkFruit.setBounds(12, 353, 467, 30);
		frame.getContentPane().add(lbChkFruit);
				
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
				};
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				};
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				};
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				};
				
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				};
				
				lbChkFruit.setText("선택한 과일 :" + fruits);
				
				
				
			}
		});
		btnChkFruit.setBounds(382, 324, 97, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("RaidioButton Tset");
		lblNewLabel_4.setBounds(12, 421, 168, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남");
		rdMale.setBounds(12, 442, 42, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여");
		rdFemale.setBounds(68, 442, 57, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("성별 :");
		lbGender.setBounds(12, 480, 57, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMale.isSelected()) {
					lbGender.setText("성별 :" + rdMale.getText());
				}else {
					lbGender.setText("성별 :" + rdFemale.getText());
				}
				
			}
		});
		btnGender.setBounds(133, 442, 97, 23);
		frame.getContentPane().add(btnGender);
		
		
	
		
	}
}
