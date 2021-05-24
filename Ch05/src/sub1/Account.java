package sub1;

public class Account {

	// ��ü�� �Ӽ�(�������)
	private String bank; // private : ĸ��ȭ
	private String id;
	private String name;
	private int money;
	
	// ������ : ��������� �ʱ�ȭ�ϱ� ���� �޼���
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(��� �޼���)
	
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("����� : " + this.bank);
		System.out.println("���¹�ȣ : " + this.id);
		System.out.println("�Ա��� : " + this.name);
		System.out.println("�����ܾ� : " + this.money);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
