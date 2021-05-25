package sub5;

/* 추상 클래스 : 
 *  - 1개 이상 추상메서드를 가지는 클래스,
	- 객체 생성 안됨,
	- 상속을 위한 클래스
*/
public abstract class Unit {

	public void move() {
		System.out.println("Unit Move...");
		
	}
	
	// 추상메서드 : 메서드만 선언
	public abstract void attack();
}
