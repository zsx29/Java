package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2021-05-26
 * 이름 : 박재형
 * 내용 : CollectionSetTest 클래스 실습하기
 * 
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		// 맵 데이터 갯수
		System.out.println("map1 원소갯수 : " + map1.size());
		
		// 맵 데이터 출력
		System.out.println("map1 101번 데이터 : " + map1.get(101));
		System.out.println("map1 102번 데이터 : " + map1.get(102));
		System.out.println("map1 103번 데이터 : " + map1.get(103));
		
		// 맵 응용 실습
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("일본", 2000));
		m1.put(103, new Apple("중국", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m1.put(201, new Apple("미국", 3000));
		m1.put(202, new Apple("영국", 2000));
		m1.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m1.put(301, new Apple("태국", 3000));
		m1.put(302, new Apple("대만", 2000));
		m1.put(303, new Apple("홍콩", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 한국사과
		Map<Integer, Apple> map = list.get(0);
		Apple apple = map.get(101);
		apple.toString();
		
		// 호주사과
		list.get(1).get(203).toString();
		
		// 홍콩사과
		list.get(2).get(303).toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
