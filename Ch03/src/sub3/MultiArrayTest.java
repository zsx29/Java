package sub3;
/*
 * ��¥ : 2020-05-17
 * �̸� : ������
 * ���� : �ڹ� MultiArray �������迭 �ǽ��ϱ�
 * */
public class MultiArrayTest {

	public static void main(String[] args) {
		
		// 1���� �迭
		int scores[] = {80, 90, 40, 55, 31};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		// 2���� �迭
		int arr2d[][] = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12}};
		
		for(int a = 0; a < 3; a++) {
			
			for(int b = 0; b < 4; b++) {
				System.out.println("�迭 arr2d["+a+"]["+b+"] : " + arr2d[a][b]);
			}
		}
		// 3���� �迭
		int arr3d[][][] = {{{1, 2, 3},  {4, 5, 6},  {7, 8, 9}},
				  	       {{10,11,12}, {13,14,15}, {16,17,18}},
				  	       {{19,20,21}, {22,23,24}, {25,26,27}}}; 
		System.out.println("3���� �迭 arr3d[][][] : " + arr3d[0][1][1]);
		System.out.println("3���� �迭 arr3d[][][] : " + arr3d[1][1][0]);
		System.out.println("3���� �迭 arr3d[][][] : " + arr3d[2][0][2]);
	}
}
