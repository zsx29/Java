package Ch04;
/*
 * 날짜 : 2021-05-17
 * 이름 : 박재형
 * 내용 : 증감연산 01
 * */
public class p57 {

	public static void main(String[] args) {
		
		int ff = 10;
		int dd = 10;
		
		++ff; // 전위연산 : ++변수명, 먼저 변수에 1증가 시킨 후 다른 연산을 실행.
		dd++; // 후위연산 : 변수명++, 다른 연산 실행 후 변수에 1증가
		
		System.out.println("ff : " + ff);
		System.out.println("dd : " + dd);
		
		int a = 10;
		int b = ++a;
		
		System.out.println("전위연산 결과 : " + b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위연산 결과 : " + y);
		System.out.println("x : " + x);
		
	}
}
