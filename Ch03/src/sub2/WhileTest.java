package sub2;
/*
 * ��¥ : 2020-05-17
 * �̸� : ������
 * ���� : �ڹ� while �ݺ��� �ǽ��ϱ�
 * */
public class WhileTest {

	public static void main(String[] args) {
		
		// 1���� 10���� ��
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1���� 10������ �� : " + sum);
			
		// do ~ while
		int i = 1;
		int eSum = 0;
		
		do {
			// do : ���� 1���� �����ϴ� �ݺ���.
			if(i % 2 == 0) {
				eSum += i;
			}
			i++;
			
		} while (i <= 10);
		
		System.out.println("1���� 10���� ¦���� : " + eSum);
		
		// break
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			System.out.println("5,7 �ּҰ���� : " + num);
		}
		// continue
		int total = 0;
		
		for (int h = 1; h <= 10; h++) {
			
			if(h % 2 == 1) {
				continue;
			}
			
			total += h;
		}
		System.out.println("1���� 10���� ¦�� ��: " + total);
	}
}













