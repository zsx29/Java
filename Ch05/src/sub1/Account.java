package sub1;

public class Account {

	// 객체의 속성(멤버변수)
	private String bank; // private : 캡슐화
	private String id;
	private String name;
	private int money;
	
	// 생성자 : 멤버변수를 초기화하기 위한 메서드
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 기능(멤버 메서드)
	
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withraw(int money) {
		this.money -= money;
	}
	
	public void show() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.money);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
}
