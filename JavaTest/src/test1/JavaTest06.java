package test1;

import java.util.Scanner;

/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� ���ǹ� ����
 * */
public class JavaTest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
		
		System.out.println("�Է��� ������ " + score + "�Դϴ�.");
		
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
