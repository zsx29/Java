package sub1;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 Method(함수)Scope(영역, 범위) 실습하기
 * */
public class MethodScopeTest {
	
	// Method 외부에 선언한 변수 = 전역변수 = Member변수 
	static int result = 0;
	
	
	public static void main(String[] args) {
		
		// main Method에서 선언한 변수 = 지역변수
		// Method에서 종료되면 메모리에서 해제
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		System.out.println("result : " + result);
		
	}// main end
	
	public static int sum(int s, int e) {
		int sum = 0;
		
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		
		return sum;
	}
}
