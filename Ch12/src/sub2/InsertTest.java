package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2021-05-27
 * �̸� : ������
 * ���� : �ڹ� �����ͺ��̽� INSERT �ǽ�
 */
public class InsertTest {

	public static void main(String[] args) {
		
		// DB����
		String host = "jdbc:mysql://192.168.10.114:3306/woguddldla";
		String user = "woguddldla";
		String pass = "1234";
				
		try {
			// (1) - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
				
			// (2) - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// (3) - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// (4) - SQL ����
			String sql = "INSERT INTO `USER1` VALUES ('J101', '������', '010-9214-8036', 27);";
			stmt.executeUpdate(sql);
			
			// (5) - SQL ��� ó��(SELECT�� ���)
			
			
			// (6) - �����ͺ��̽� ��������...
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
				
		System.out.println("���α׷� ����...");
	}
}




















