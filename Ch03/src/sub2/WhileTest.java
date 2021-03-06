package sub2;
/*
 * 날짜 : 2020-05-17
 * 이름 : 박재형
 * 내용 : 자바 while 반복문 실습하기
 * */
public class WhileTest {

	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int k = 1;
		int sum = 0;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
			
		// do ~ while
		int i = 1;
		int eSum = 0;
		
		do {
			// do : 최초 1번은 실행하는 반복문.
			if(i % 2 == 0) {
				eSum += i;
			}
			i++;
			
		} while (i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + eSum);
		
		// break
		int num = 1;
		
		while(true) {
			
			num++;
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			System.out.println("5,7 최소공배수 : " + num);
		}
		// continue
		int total = 0;
		
		for (int h = 1; h <= 10; h++) {
			
			if(h % 2 == 1) {
				continue;
			}
			
			total += h;
		}
		System.out.println("1부터 10까지 짝수 합: " + total);
	}
}













