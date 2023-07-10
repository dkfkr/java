package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "java";
		String pass = "1234";
		
		try {
			// 1단계 - 드라이버 로드
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    
			// 2단계 - 접속
		    Connection conn = DriverManager.getConnection(host, user, pass);
		    
			// 3단계 - SQl생성
			Statement stmt = conn.createStatement();
		    
			// 4단계 - 실행
			String sql = "Select * from `user1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 5단계 - 결과처리
			while(rs.next() ) {
				
				String uid  = rs.getString(1);
				String name = rs.getString(2);
				String hp   = rs.getString(3);
				int    age  = rs.getInt(4);
				
				System.out.printf("%S,%s,%s,%d\n", uid, name, hp, age);
				
			}
			
			// 6단계 - 연결해제
			rs.close();
			stmt.close();
			conn.close();
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("commit");
		
	}
}
