package Ch04;
/*
 * ��¥ : 2021-05-17
 * �̸� : ������
 * ���� : �������� 01
 * */
public class p57 {

	public static void main(String[] args) {
		
		int ff = 10;
		int dd = 10;
		
		++ff; // �������� : ++������, ���� ������ 1���� ��Ų �� �ٸ� ������ ����.
		dd++; // �������� : ������++, �ٸ� ���� ���� �� ������ 1����
		
		System.out.println("ff : " + ff);
		System.out.println("dd : " + dd);
		
		int a = 10;
		int b = ++a;
		
		System.out.println("�������� ��� : " + b);
		
		int x = 10;
		int y = x++;
		System.out.println("�������� ��� : " + y);
		System.out.println("x : " + x);
		
	}
}
