package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥ : 2021-05-26
 * �̸� : ������
 * ���� : Date Ŭ���� �ǽ��ϱ�
 */
public class DateClass {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH�� mm�� ss��");
		String now = sdf.format(date);
		
		System.out.println(now);
	}
}
