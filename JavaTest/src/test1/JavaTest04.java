package test1;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� ������ ����
 * */
public class JavaTest04 {

	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z = 0;
		
		z = x + y;
		System.out.println("x + y : " + z);
		
		z = x - y;
		System.out.println("x - y : " + z);
		
		z = x * y;
		System.out.println("x * y : " + z);
		
		z = x / y;
		System.out.println("x / y : " + z);
		
		z = (x + y) * (x - y);
		System.out.println("(x + y) * (x - y) : " + z);
		
		z = (x * y) + (x / y);
		System.out.println("(x * y) + (x / y) : " + z);
	}
}
