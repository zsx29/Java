package sub3;
/*
 * 날짜 : 2021-05-26
 * 이름 : 박재형
 * 내용 : String 멤버클래스 실습하기
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		String str = "Hello korea";
		
		// length - 문자갯수
		System.out.println("str 문자열 길이 : " + str.length());
		
		// charAt - 문자열에서 특정문자 추출
		System.out.println("str 0번째 문자 : " + str.charAt(0));
		System.out.println("str 7번째 문자 : " + str.charAt(7));
		
		// substring - 문자열 자르기
		System.out.println("str 0 ~ 5까지 문자열 : " + str.substring(0, 5));
		System.out.println("str 6 ~ 마지막까지 문자열 : " + str.substring(6));
		
		// indexOf, lastIndexOf - 문자열에서 특정문자 인덱스(0부터 시작하는 번호) 추출
		System.out.println("str에서 앞에서 부터 문자 e 인덱스: " + str.indexOf("e"));
		System.out.println("str에서 뒤에서 부터 문자 e 인덱스 : " + str.lastIndexOf("e"));
		
		// replace - 문자열 교체
		System.out.println("str 문자열에서 'korea'를 'busan'으로 : " + str.replace("korea", "busan"));
		System.out.println("str 문자열에서 'hello'를 'welcome'으로 : " + str.replace("Hello", "welcome"));
		
		// valueOf - 기본타입 변수를 문자열로 변환해주는 함수
		int var1 = 1;
		double var2 = 1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		// 문자열로 추출
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
