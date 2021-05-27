package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2021-05-27
 * 이름 : 박재형
 * 내용 : 자바 데이터베이스 SELECT 실습
 */
public class SelectTest {

	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/woguddldla";
		String user = "woguddldla";
		String pass = "1234";
		
		try {
			
			// (1) - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// (2) - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// (3) - SQL 실행객체 생서성
			Statement stmt = conn.createStatement();
			
			// (4) - SQL 실행
			String sql = "SELECT * FROM `USER1`;";
			
			// (4-1) - SELECT일 경우 실행은
			ResultSet rs = stmt.executeQuery(sql);	
			
			// (5) - 결과셋 처리 (SELECT일 경우) - 데이터 뿌려주기
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("==================");
				System.out.println("아이디 : " + uid);
				System.out.println("이름 : " + name);
				System.out.println("휴대폰 번호 : " + hp);
				System.out.println("나이 : " + age);
				System.out.println("==================");
				
			}
			
			// (6) - 데이터베이스 종료
			conn.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램 종료....");
	}
}












