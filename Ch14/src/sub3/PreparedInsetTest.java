package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 2023 07 11
 * 이름 : 강원빈
 * 내용 : PreparedStatement 실습
 * 
 * PreparedStatement
 *  - 기존 Statement 보다 향상된 명령어
 *  - Ouery Parameter에 값을 매핑 시켜 쿼리 실행
 *  
 *  value Object 
 *   - 도메인 값을 속성으로 갖는 객체
 *   - 테이블 개체를 객체로 변환할 때 사용하는 객체
 *   - DTO 와 구분
 */

public class PreparedInsetTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "java";
		String pass = "1234";
 		
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계
		    Connection conn = DriverManager.getConnection(host, user, pass);
			// 3단계
			String sql = "insert into `user2` values (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "hong");
			psmt.setString(3, "010-1234-1001");
			psmt.setInt(4, 23);
			// 4단계
			psmt.executeUpdate();
			// 5단계
			
			// 6단계
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("commit");
		
	}
}
