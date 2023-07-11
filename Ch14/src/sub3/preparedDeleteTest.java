package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparedDeleteTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "java";
		String pass = "1234";
		
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2
			Connection conn = DriverManager.getConnection(host, user, pass);
			// 3
			String sql = "delete from user2 where uid=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			//
			psmt.executeUpdate();
			//
			//
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("commit");
		
	}
}
