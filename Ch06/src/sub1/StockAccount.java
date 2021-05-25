package sub1;

public class StockAccount extends Account {

	// 객체 속성
	private String stock;
	private int amount;
	private int price;
	
	// 생성자
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money); // super = parent
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	// 기능
	public void sell(int amount, int price) {
		int total = amount * price;
		money += total;
	}
	
	public void buy(int amount, int price) {
		int total = amount * price;
		money -= total;
	}
	
	public void show() {
		System.out.println("=======================");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.money);
		System.out.println("주식종목 : " + this.stock);
		System.out.println("주식수량 : " + this.amount);
		System.out.println("주식가격 : " + this.price);
		System.out.println("-----------------------");		
	}
	
	
}