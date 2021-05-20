package sub1;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 Method(함수) 실습하기
 * */
public class MethodTest {
	
	// Main Method : 자바프로그램의 시작점
	public static void main(String[] args) {
	
		// Method 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);

		System.out.println("y1 : " + f(1));
		System.out.println("y2 : " + f(2));
		System.out.println("y3 : " + f(3));
		
		// sum Method 호출
		
		System.out.println("1부터 10까지의 합 : " + sum(1, 10));
		System.out.println("1부터 10까지의 합 : " + sum(1, 100));
		System.out.println("1부터 10까지의 합 : " + sum(1, 1000));
	}
	
	// Method 정의 : 일련의 코드로직을 모듈화 시킨 것
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
		// y의 타입은 int, 리턴함수 타입을 void -> int로 변경
	}
	
	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for(int k = start; k <= end; k++) {
			sum += k;
		}
		
		return sum;
	}
}
