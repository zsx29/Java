package test2;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� �ڷᱸ�� ����(stack) ��������
 * */
public class JavaTest09 {
	
	static int STACK_SIZE = 10;
	
	public static void main(String[] args) {
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
	}
}
