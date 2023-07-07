package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMycalcV;
	private JTextField txtDsp;
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; // 1:+ 2:- 3:X
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalcV = new JFrame();
		frmMycalcV.setTitle("MyCalc v 1.0");
		frmMycalcV.setBounds(100, 100, 321, 387);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.BOLD, 35));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 286, 95);
		frmMycalcV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(11, 115, 63, 49);
		frmMycalcV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(86, 115, 63, 49);
		frmMycalcV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(161, 115, 63, 49);
		frmMycalcV.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(235, 115, 63, 49);
		frmMycalcV.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(11, 174, 63, 49);
		frmMycalcV.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(86, 174, 63, 49);
		frmMycalcV.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(161, 174, 63, 49);
		frmMycalcV.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setBounds(235, 174, 63, 49);
		frmMycalcV.getContentPane().add(btnMulti);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				
				num1 = 1;
			}
		});
		btn1.setBounds(11, 233, 63, 49);
		frmMycalcV.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = 2;
			}
		});
		btn2.setBounds(86, 233, 63, 49);
		frmMycalcV.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(161, 233, 63, 49);
		frmMycalcV.getContentPane().add(btn3);
		
		JButton btnMs = new JButton("-");
		btnMs.setBounds(235, 233, 63, 49);
		frmMycalcV.getContentPane().add(btnMs);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(11, 292, 63, 49);
		frmMycalcV.getContentPane().add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(86, 292, 63, 49);
		frmMycalcV.getContentPane().add(btnC);
		
		JButton btnps = new JButton("+");
		btnps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator =1;
			}
		});
		btnps.setBounds(161, 292, 63, 49);
		frmMycalcV.getContentPane().add(btnps);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
						
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
					
				}else if(operator == 3) {
					result = num1 * num2;
				
				}else if(operator == 4) {
					result = num1 / num2;
				}
			
				txtDsp.setText(""+ result);
			}
		});
		
		btneq.setBounds(235, 292, 63, 49);
		frmMycalcV.getContentPane().add(btneq);
	}
}
