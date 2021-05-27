package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2021-05-27
 * 이름 : 박재형
 * 내용 : 자바 데이터베이스 INSERT 실습
 */
public class InsertTest {

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
			
			// (3) - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// (4) - SQL 실행
			String sql = "INSERT INTO `USER1` VALUES ('J101', '김유신', '010-9214-8036', 27);";
			stmt.executeUpdate(sql);
			
			// (5) - SQL 결과 처리(SELECT일 경우)
			
			
			// (6) - 데이터베이스 접속종료...
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
				
		System.out.println("프로그램 종료...");
	}
}




















