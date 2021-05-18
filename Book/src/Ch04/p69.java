package Ch04;
/*
 * 날짜 : 2021-05-17
 * 이름 : 박재형
 * 내용 : 삼항연산
 * */
public class p69 {

	public static void main(String[] args) {
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		//                   조건식 ? 값1(연산식) : 값2(연산식)
		// 					 조건식이 true면 값1 출력
		//					 조건식이 false면 값2 출력
		System.out.println(pass);
		
	}
}
