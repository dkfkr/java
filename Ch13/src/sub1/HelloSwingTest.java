package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 날짜 : 2023 07 07
 * 이름 : 김철학
 * 내용 : JAVA Swing 실습하기
 * 
 * GUI 프로그래밍
 *  - 사용자가 편리하게 프로그램을 사용할 수 잇게 윈도우를 지원하는 프로그래밍
 *  - Java는 GUI 개발을 위해 Swing 라이브러리를 지원
 *  - 편리한 GUI를 위해 windowbuilder 설치
 */

public class HelloSwingTest {
	public static void main(String[] args) {
		
		// 윈도우 생성
		JFrame frame = new JFrame("hello swing");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		// 컨테이너 생성
		Container pane = frame.getContentPane();
		
		// 컴포넌트 배치
		JLabel ladel = new JLabel("hello swing");
		pane.add(ladel);
		
		JButton button = new JButton("check");
		pane.add(button);
		
	}
}
