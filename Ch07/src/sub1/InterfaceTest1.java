package sub1;
/*
 * 날짜 : 2021-05-25
 * 이름 : 박재형
 * 내용 : 자바 인터페이스 실습하기.
 *  - 추상메서드만 사용함
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		// 인터페이스 - 클래스 설계의 표준 가이드 역할을 한다.
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.chDown();
	}
}
