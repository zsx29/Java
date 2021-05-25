package sub5;
/*
 * 날짜 : 2021-05-25
 * 이름 : 박재형
 * 내용 : 자바 추상클래스 실습하기
 */
public class AbstractTest {

	public static void main(String[] args) {
		// 추상 : 구체화 된 것이 아님.
		Unit marin = new Marin();
		Unit zealot = new Zealot();
		Unit zergling = new Zergling();
		
		marin.move();
		zealot.move();
		zergling.move();
		
		marin.attack();
		zealot.attack();
		zergling.attack();
		
	}
}
