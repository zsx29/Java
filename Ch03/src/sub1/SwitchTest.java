package sub1;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

/*
 * ��¥ : 2020-05-17
 * �̸� : ������
 * ���� : �ڹ� switch ���ǹ� �ǽ��ϱ�.
 * */
public class SwitchTest {

	public static void main(String[] args) {
		
		String animal = "shark";
		
		switch (animal) {
		case "lion":
			System.out.println("animal�� lion�Դϴ�.");
			break;
			
		case "eagle":
			System.out.println("animal�� eagle�Դϴ�.");
			break;
			
		case "tiger":
			System.out.println("animal�� tiger�Դϴ�.");
			break;
			
		default:
			System.out.println("animal�� lion, eagle, tiger�� �ƴմϴ�.");
			break;
		}
		
		// ��������
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int score = sc.nextInt();
		System.out.println("�Է� ���� : " + score);
		
		switch (score/10) {
		case 10:
			System.out.println("A �Դϴ�.");
			break;
		case 9:
			System.out.println("A �Դϴ�.");
			break;
		case 8:
			System.out.println("B �Դϴ�.");
			break;	
		case 7:
			System.out.println("C �Դϴ�.");
			break;
		case 6:
			System.out.println("D �Դϴ�.");
			break;
		default:
			System.out.println("F �Դϴ�.");
			break;
		}
		
		// �ڹ� ex) 95/10 = 9, 99/10 = 9, 91/10 = 9
		
	}
}
	




























