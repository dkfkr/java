package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


class User2VO {
	private String uid;
	private String name;
	private String hp;
	private int    age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "java";
		String pass = "1234";
		
		// 결과 처리에 사용할 리스트 생성
		List<User2VO> users = new ArrayList<>();
		
		
		try {
			// 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3
			String sql = "select * from user2";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4
			ResultSet rs = psmt.executeQuery();
			
			// 5
			while(rs.next()) {
				
				//VO객체 생성 및 초기화
				User2VO vo = new User2VO();
				vo.setUid (rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp  (rs.getString(3));
				vo.setAge (rs.getInt(4));
				
				//VO객체 list저장
				users.add(vo);
			}
			
			// 6
			psmt.close();
			conn.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(User2VO vo : users) {
			System.out.println("----------------");
			System.out.println("아이디 : " + vo.getUid());
			System.out.println("이름 : " + vo.getName());
			System.out.println("휴대폰 : " + vo.getHp());
			System.out.println("나이 : " + vo.getAge());	
			System.out.println("----------------");

		}
		
	}
}
