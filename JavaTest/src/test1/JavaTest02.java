package test1;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 기본입출력문제
 * */
import java.util.Scanner;

public class JavaTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input값 입력 : ");
		
		input = sc.nextInt();
		int result = (1 + 2) * input;
		
		System.out.println("(1 + 2) x input : " + result);
		
		String name;
		System.out.print("name 값 입력 : ");
		
		name = sc.next();
		String hello = "안녕! " + name + "반갑습니다.";
		
		System.out.println(hello);
	}
}
