package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023 07 10
 * 이름 : 강원빈
 * 내용 : update 실습
 * 
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "java";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 1단계 - JDBC 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 1단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 1단계 - SQL 실행
			String sql = "UPDATE user1 SET "
					+ "hp = '010-1234-1111', "
					+ "age = 25 "
					+ "WHERE uid = 'j101'";
			stmt.executeUpdate(sql);
			// 1단계 - 결과 처리
			
			
			// 1단계 - 연결해제
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("up commit");
		
	}
}
