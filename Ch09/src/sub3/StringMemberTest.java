package sub3;
/*
 * ��¥ : 2021-05-26
 * �̸� : ������
 * ���� : String ���Ŭ���� �ǽ��ϱ�
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello korea";
		
		// length - ���ڰ���
		System.out.println("str ���ڿ� ���� : " + str.length());
		
		// charAt - ���ڿ����� Ư������ ����
		System.out.println("str 0��° ���� : " + str.charAt(0));
		System.out.println("str 7��° ���� : " + str.charAt(7));
		
		// substring - ���ڿ� �ڸ���
		System.out.println("str 0 ~ 5���� ���ڿ� : " + str.substring(0, 5));
		System.out.println("str 6 ~ ���������� ���ڿ� : " + str.substring(6));
		
		// indexOf, lastIndexOf - ���ڿ����� Ư������ �ε���(0���� �����ϴ� ��ȣ) ����
		System.out.println("str���� �տ��� ���� ���� e �ε���: " + str.indexOf("e"));
		System.out.println("str���� �ڿ��� ���� ���� e �ε��� : " + str.lastIndexOf("e"));
		
		// replace - ���ڿ� ��ü
		System.out.println("str ���ڿ����� 'korea'�� 'busan'���� : " + str.replace("korea", "busan"));
		System.out.println("str ���ڿ����� 'hello'�� 'welcome'���� : " + str.replace("Hello", "welcome"));
		
		// valueOf - �⺻Ÿ�� ������ ���ڿ��� ��ȯ���ִ� �Լ�
		int var1 = 1;
		double var2 = 1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		// ���ڿ��� ����
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
