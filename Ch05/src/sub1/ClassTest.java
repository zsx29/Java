package sub1;

public class ClassTest {
	
	public static void main(String[] args) {
		
		//��ü ���� �� �ʱ�ȭ
		Account kb = new Account("��������", "3333-01-2696617", "������", 10000);
		
		Account wr = new Account("�츮����", "1214-44-646484", "������", 30000);
		
		//��ü Ȱ��
		kb.deposit(40000);
		kb.withraw(5000);
//		kb.money++; // ����ڵ� -> ĸ��ȭ ������� -> ����ڵ� ����
		kb.show();
		
		wr.deposit(30000);
		wr.withraw(7000);
//		wr.money -= 1; // ����ڵ� -> ĸ��ȭ ������� -> ����ڵ� ����
		wr.show();
	}
}
