package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdateTest {
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
			String sql = "update `user2` set `hp` =?, `age` =? where `uid` =?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 25);
			psmt.setString(3, "j101");
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

