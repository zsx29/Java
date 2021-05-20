package test2;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 자료구조 스택(stack) 연습문제
 * */
public class JavaTest09 {
	
	static int STACK_SIZE = 10;
	
	public static void main(String[] args) {
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
	}
}
