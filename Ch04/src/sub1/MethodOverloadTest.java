package sub1;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 MethodOverload 실습하기 ((이름이 똑같은 메서드 = 오버로드))
 * */
public class MethodOverloadTest {

	public static void main(String[] args) {
		
		int r1 = add(1);
		int r2 = add(2, 3);
		String r3 = add("박재형");
		
		System.out.println("r1 : "+ r1);
		System.out.println("r2 : "+ r2);
		System.out.println("r3 : "+ r3);
		
	}// main end
	
	// MethodOverload : 메서드의 이름은 똑같지만 매개변수의 타입과 갯수로 구분하는 메서드
	// 함수는 같아도 매개변수로 구분한다
	// 예시) 오버로드는 같지만 뭘태우느냐에 따라 구분이 가능하다.
	
	public static int add(int num) {
		return num++;
	}
	public static int add(int x, int y) {
		return x + y;
	
	}
	public static String add(String str) {
		return str + "님 반갑습니다.";
	}
}




