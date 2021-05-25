package sub2;

// final 클래스는 상속할 수 없는 클래스.
public class BBB extends AAA {
	/*
	 	부모클래스 BBB - method1 는 final 선언으로 Override 할 수 없다.
	@Override
	public final void method1() {
		System.out.println("BBB - method1...");
	}
	*/
	
	// Overload
	public void method2(int a) {
		System.out.println("BBB - method2...");
	}
	
	// Overload
	public void method3() {
		System.out.println("BBB - method3...");	
	}

}
