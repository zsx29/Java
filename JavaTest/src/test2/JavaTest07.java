package test2;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� �ִ����� ��������
 * */
public class JavaTest07 {

	public static void main(String[] args) {
		System.out.println("1�� 5�� �ִ����� : " + gcd(1, 5));
		System.out.println("3�� 6�� �ִ����� : " + gcd(3, 6));
		System.out.println("12�� 18�� �ִ����� : " + gcd(12, 18));
		System.out.println("60�� 24�� �ִ����� : " + gcd(60, 24));
	}
	
	public static int gcd(int x, int y) {
		
		int temp = 0;
		
		if(x < y) {
			temp = x;
		}else {
			temp = y;
		}
		
		while(true) {
			
			if(x % temp ==0  && y % temp ==0) {
				break;
			}
			temp--;
		}
		return temp;
	}
}
