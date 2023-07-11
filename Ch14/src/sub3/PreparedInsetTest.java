package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 2023 07 11
 * 이름 : 강원빈
 * 내용 : PreparedStatement 실습
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
