package sub1;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� Method(�Լ�) �ǽ��ϱ�
 * */
public class MethodTest {
	
	// Main Method : �ڹ����α׷��� ������
	public static void main(String[] args) {
	
		// Method ȣ��
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);

		System.out.println("y1 : " + f(1));
		System.out.println("y2 : " + f(2));
		System.out.println("y3 : " + f(3));
		
		// sum Method ȣ��
		
		System.out.println("1���� 10������ �� : " + sum(1, 10));
		System.out.println("1���� 10������ �� : " + sum(1, 100));
		System.out.println("1���� 10������ �� : " + sum(1, 1000));
	}
	
	// Method ���� : �Ϸ��� �ڵ������ ���ȭ ��Ų ��
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
		// y�� Ÿ���� int, �����Լ� Ÿ���� void -> int�� ����
	}
	
	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for(int k = start; k <= end; k++) {
			sum += k;
		}
		
		return sum;
	}
}
