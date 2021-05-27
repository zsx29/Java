package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2021-05-27
 * 이름 : 박재형
 * 내용 : 자바 데이터베이스 프로그래밍 실습
 * 순서 : mysql 다운로드 -> 자바 라이브러리 추가 -> 접속테스트 ->
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		// 접속테스트
		
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/woguddldla";
		String user = "woguddldla";
		String pass = "1234";
		
		try {
			// (1) - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			// (2) - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if (conn != null) {
				System.out.println("데이터베이스 접속 성공");
			}else
				System.out.println("데이터베이스 접속 실패");
			
			// (3) - SQL 실행객체 생성
			// (4) - SQL 실행
			// (5) - SQL 결과 처리(SELECT일 경우)
			// (6) - 데이터베이스 접속종료...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("프로그램 종료...");
	}
}
