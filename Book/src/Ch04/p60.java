package Ch04;
/*
 * ��¥ : 2021-05-17
 * �̸� : ������
 * ���� : ������
 * */
public class p60 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// and ���� : ���� �� ��� true�� ��츸 ����� true
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		// or ���� : �� �� �� �ϳ� �̻��� ���� true�� ��� ����� true
		System.out.println(a > b || a == b);
		System.out.println(a < b || a == b);
	}
}
