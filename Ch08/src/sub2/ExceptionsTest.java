package sub2;
/*
 * ��¥ : 2021-05-25
 * �̸� : ������
 * ���� : �ڹ� �������� �ǽ�
 * 
 */
public class ExceptionsTest {

	public static void main(String[] args) {
		
		// �迭 �ε��� ���� ����
		int arr[] = new int[3];
		
		for(int i = 0; i <= 3; i++) {
			try {
				arr[i] = i + 1;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		for(int num : arr) {
			System.out.println("num : " + num);
		}
		
		// NullPointer ����
		try {
			Tiger tiger = null;  // �������� ����
		
			tiger.move();  
			tiger.hunt();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		

		// Casting
		
		
		try {
			Animal a1 = new Eagle();
			Animal a2 = new Shark();
			
			Eagle eagle = (Eagle) a1;
			Shark shark = (Shark) a1;
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		

		System.out.println("���α׷� ����...");
	}
}









