package Ch04;

public class p70 {
	/*
	 * 날짜 : 2021-05-17
	 * 이름 : 박재형
	 * 내용 : 문자열연산
	 * */
	public static void main(String[] args) {
		
		String name = "홍길동";
		System.out.println("안녕하세요 " + name + " 입니다.");
		
		int height = 178;
		System.out.println("키는 " + height + " 입니다.");
		
		// String weight = 75.5; // 에러발생(문자자료형 변수에는 숫자 대입 x)
		String weight = 75.5 + "";
		System.out.println("제 몸무게는 " + weight + "kg입니다.");
		
		int ageInt = 30;      // 정수
		String ageStr = "30"; // 문자열
	}
}
