package test1;

import java.util.Scanner;

/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 조건문 문제
 * */
public class JavaTest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		case 5:
			System.out.println("d");
			break;

		default:
			System.out.println("f");
			break;
		}
		
	}
}
