package sub3;
/*
 * 날짜 : 2021-05-26
 * 이름 : 박재형
 * 내용 : String 클래스 실습하기
 */
public class StringTest {

	public static void main(String[] args) {
		
		// 문자열 = 문자 + 배열
		String str = "Hello";
		//     객체
		char arr[] = {'h', 'e', 'l', 'l', 'o'};
		
		// 문자열 객체
		String str1 = new String("hello");  // FM
		String str2 = new String("hello");  
		String str3 = "hello";  // literal 문자열
		String str4 = "hello";
		
		// 문자열 비교 
		if (str1 == str2) {
			System.out.println("str1과 str2의 참조값이 같다");
		}else {
			// 각 부여받은 주소값이 다르다.
			System.out.println("str1과 str2의 참조값이 서로 다르다.");
		}
		
		// 문자열 비교
		if (str3 == str4) {
			System.out.println("str3과 str4의 참조값이 같다");
		}else {
			System.out.println("str3과 str4의 참조값이 서로 다르다");
		}
		
		// 문자열 비교
		if (str1.equals(str4)) {
			System.out.println("str1과 str4의 문자열 값이 같다.");
		}else {
			System.out.println("str1과 str4의 문자열 값이 서로 다르다.");
		}
	}
}
