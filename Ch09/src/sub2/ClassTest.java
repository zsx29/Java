package sub2;

import sub1.Apple;

/*
 * ��¥ : 2021-05-25
 * �̸� : ������
 * ���� : �ڹ� ����Ŭ����(�⺻ API Ŭ����) �ǽ��ϱ�.
 * 
 */
public class ClassTest {

	public static void main(String[] args) {
		// Class Ŭ���� : ��ü�� ���� ������ �� ����ϴ� Ŭ����.
		
		// ������ü
		Apple a1 = new Apple("�ѱ�", 3000);
		a1.toString();
		
		// ������ü
		try {
			Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
			
			a2.toString();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
