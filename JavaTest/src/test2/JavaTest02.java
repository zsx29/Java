package test2;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� �迭���� �ִ� ã��
 * */
public class JavaTest02 {

	public static void main(String[] args) {
		
		int arr[] = {17, 92, 18, 33, 58, 7, 26, 42};
		int maxNum = arr[0];
		
		for(int i = 0; i < 8; i++) {
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		
		System.out.println("�迭 arr���� ���� ū �� : " + maxNum);
	}
}
