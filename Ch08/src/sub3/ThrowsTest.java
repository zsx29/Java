package sub3;
/*
 * ��¥ : 2021-05-25
 * �̸� : ������
 * ���� : �ڹ� ���� ������ �ǽ�
 * 
 */
public class ThrowsTest {

	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try {
			r1 = cal.div(1, 2);
			r2 = cal.div(1, 0);
			r3 = cal.div(1, -1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		System.out.println("���� ...");
	
	}
}
