package test1;
/*
 * ��¥ : 2021-05-20
 * �̸� : ������
 * ���� : �ڹ� �⺻����¹���
 * */
import java.util.Scanner;

public class JavaTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input�� �Է� : ");
		
		input = sc.nextInt();
		int result = (1 + 2) * input;
		
		System.out.println("(1 + 2) x input : " + result);
		
		String name;
		System.out.print("name �� �Է� : ");
		
		name = sc.next();
		String hello = "�ȳ�! " + name + "�ݰ����ϴ�.";
		
		System.out.println(hello);
	}
}
