package sub6;

import java.util.Calendar;

/*
 * ��¥ : 2021-05-26
 * �̸� : ������
 * ���� : CalendarTest Ŭ���� �ǽ��ϱ�
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		// �ڹ��� ��ǥ���� �̱��� ��ü
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d - %d - %d\n", year, month, date);
		System.out.printf("%d : %d : %d\n", hour, minute, second);
		
		
		
		
		
	}
}
