package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020-05-17
 * 이름 : 박재형
 * 내용 : if 조건문 실습하기.
 * */
public class IfTest {

	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if (num1 < num2) {
			System.out.println("num1 은 num2보다 작다.");
		}
		
		if (num1 > 0) {
			if (num2 > 1) {
				System.out.println("num1 은 0보다 크고 num2는 1보다 크다.");
			}
		}
		
		if (num1 > 0 && num2 > 1) {
			System.out.println("num1 은 0보다 크고 num2는 1보다 크다.");
			
		}
		
		
		// if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if (var1 > var2) {
			// 조건이 참
			System.out.println("var1이 var2보다 크다.");
		}else {
			// 조건이 거짓
			System.out.println("var1이 var2보다 작다.");
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if (n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2이 n3보다 크다.");
		}else if(n3 > n4){
			System.out.println("n3이 n4보다 크다.");	
		}else{
			System.out.println("n4 가장크다.");
		}
		
		// 연습문제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력 점수 : " + score);
		
		if (score >= 90) {
			System.out.println("A입니다.");
		}else if(80 <= score && score < 90) {
			System.out.println("B입니다.");
		}else if(70 <= score && score < 80) {
			System.out.println("C입니다.");
		}else if(60 <= score && score < 70) {
			System.out.println("D입니다.");
		}else {
			System.out.println("F입니다.");
		}
		
	}
}














