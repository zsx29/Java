package test2;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� �迭 ���� ����ϱ� (�ڸ���ȯ)
 * */
public class JavaTest04 {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5 ,3};
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = i+1; j < 5; j++) {
				
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		// ���ĵ� �迭 ����ϱ�
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
