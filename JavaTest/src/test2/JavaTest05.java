package test2;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� ���� �����ϱ�
 * */
public class JavaTest05 {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5, 3};
		
		for(int j = 1; j < arr.length; j++) {
			
			int key = arr[j];
			int i = j -1;
			
			while(i >= 0 && arr[i] > key) {
				
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
