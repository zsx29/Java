package sub3;
/*
 * 부모의 추상적인 move()클래스를 자식들이 재정의 한다 -> 다형성
 * 
 */
public class Animal {

	public void move() {
		
		System.out.println("Animal move...");
	}
	
	public void hunt() {}
}
