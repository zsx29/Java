package test1;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 삼항연산자 문제
 * */
public class JavaTest07 {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 21;
		// 대입연산자 왼쪽은 변수가 와야한다.
		int max = x > y ? x : y;
		
		System.out.println("x와 y중 큰 수 : " + max);
	}
}
