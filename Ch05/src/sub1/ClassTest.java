package sub1;

public class ClassTest {
	
	public static void main(String[] args) {
		
		//객체 생성 및 초기화
		Account kb = new Account("국민은행", "3333-01-2696617", "박재형", 10000);
		
		Account wr = new Account("우리은행", "1214-44-646484", "김춘추", 30000);
		
		//객체 활용
		kb.deposit(40000);
		kb.withraw(5000);
//		kb.money++; // 취약코드 -> 캡슐화 해줘야함 -> 취약코드 예방
		kb.show();
		
		wr.deposit(30000);
		wr.withraw(7000);
//		wr.money -= 1; // 취약코드 -> 캡슐화 해줘야함 -> 취약코드 예방
		wr.show();
	}
}
