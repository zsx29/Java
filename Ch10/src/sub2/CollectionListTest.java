package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/*
 * 날짜 : 2021-05-26
 * 이름 : 박재형
 * 내용 : CollectionListTest 클래스 실습하기
 * 
 * collection
	- List - ArrayList
	- Set  - HashSet
	- Map  - HashMap
 * 
 * 
 */
public class CollectionListTest {

	public static void main(String[] args) {
		
		// List 생성 1
		List<Integer> list1 = new ArrayList<>();
		
		// List 데이터
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		//       (index, 값)
		
		System.out.println("list1 : " + list1);
		
		for(int num : list1) {
			System.out.print(num + ", ");
		}
		System.out.println("\n");
		
		
		// List 생성 2
		List<String> list2 = new ArrayList<>();
		
		// List 데이터
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for(String str : list2) {
			System.out.print(str + ", ");
		}
		System.out.println("\n");
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 1000));
		list3.add(new Apple("일본", 1000));
		list3.add(new Apple("대만", 1000));

		Apple apple = list3.get(0);
		apple.toString();
		
		list3.get(2).toString();
		
		list3.get(3).toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
