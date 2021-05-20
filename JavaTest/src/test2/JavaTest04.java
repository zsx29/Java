package test2;
/*
 * 날짜 : 2021-05-20
 * 이름 : 박재형
 * 내용 : 자바 배열 선택 출력하기 (자리교환)
 * */
public class JavaTest04 {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 1, 5 ,3};
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = i+1; j < 5; j++) {
				
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		// 정렬된 배열 출력하기
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
