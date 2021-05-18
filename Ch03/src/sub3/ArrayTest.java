package sub3;
/*
 * 날짜 : 2020-05-17
 * 이름 : 박재형
 * 내용 : 자바 array 배열 실습하기
 * */
public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열
		int nums[] = {1, 2, 3, 4, 5};
				   //[0][1][2][3][4] : index 값
				   // 정적 리스트(배열 추가 x)
		
		// 배열 길이
		System.out.println("배열 nums의 원소 갯수 : " + nums.length);
		
		// 배열 원소 출력
		System.out.println("배열 nums의 1번째 원소" + nums[0]);
		System.out.println("배열 nums의 2번째 원소" + nums[1]);
		System.out.println("배열 nums의 3번째 원소" + nums[2]);
		
		// 배열 반복문
		// 1
		for(int num : nums) {
			System.out.println("배열 nums의 원소 : " + num);
		}
		// 2
		String people[] = {"김유신","김춘추","장보고","강감찬","이순신"};
		
		for(String person : people) {
			System.out.println("people의 원소 : " + person);
			
		}
	}
}
