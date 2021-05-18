package Ch04;
/*
 * 날짜 : 2021-05-17
 * 이름 : 박재형
 * 내용 : 논리연산
 * */
public class p60 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// and 연산 : 양쪽 항 모두 true인 경우만 결과값 true
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		// or 연산 : 두 항 중 하나 이상의 항이 true인 경우 결과값 true
		System.out.println(a > b || a == b);
		System.out.println(a < b || a == b);
	}
}
