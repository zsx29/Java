package test1;

/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� ���̾Ƹ�� ����
 * */
public class JavaTest09 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 1; i <= 9; i++) {
			
			if (i <= 5) {
				
				count++;
				
			}else {
				
				count--;
				
			}
			
			for(int j = 1; j <= 5 - count; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * count; k++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}
}
