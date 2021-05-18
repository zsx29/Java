package sub2;
/*
 * 날짜 : 2020-05-17
 * 이름 : 박재형
 * 내용 : 자바 for 반복문 실습하기
 * */
public class ForTest {

	public static void main(String[] args) {
		
		// for
		for (int i = 1; i <= 3; i++) {
			
			System.out.printf("%d.hello world\n", i);
			
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k =1; k <= 10; k++) {
			
			sum += k;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
		// 1부터 10까지 짝수 합
		int eSum = 0;
		
		for (int j = 1; j <= 10; j++) {
			
			if(j % 2 == 0) {
				
			eSum += j;
			
			}
		}
		System.out.println("1부터 10까지 짝수 합 : " + eSum);
		// 중첩 for
		for(int a = 1; a <= 3; a++) {
			
			System.out.println("a : " + a);
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}
		}
		
		// 구구단
		for(int a = 2; a <= 9; a++) {
			
			System.out.printf("~~~~~~~{%d}단~~~~~~\n",a);
			
			for(int b = 1; b <= 9; b++) {
				int c = a * b;
				System.out.printf("%d x %d = %d\n", a , b, c);
			}
		}
		
		// 별삼각형
		for(int start = 1; start <= 10; start++) {
			
			for(int end = 1; end <= start; end++) {
				
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
		// 별삼각형_2
		for(int x = 1; x <= 5; x++) {
			
			for(int y = 1; y <= 5-x; y++) {
				
				System.out.print("☆");
			}
			
			for(int z = 1; z <= x; z++) {
				
				System.out.print("★");
			}
			System.out.print("\n");
		}
	}
}






















