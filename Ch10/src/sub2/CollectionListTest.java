package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/*
 * ��¥ : 2021-05-26
 * �̸� : ������
 * ���� : CollectionListTest Ŭ���� �ǽ��ϱ�
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
		
		// List ���� 1
		List<Integer> list1 = new ArrayList<>();
		
		// List ������
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		//       (index, ��)
		
		System.out.println("list1 : " + list1);
		
		for(int num : list1) {
			System.out.print(num + ", ");
		}
		System.out.println("\n");
		
		
		// List ���� 2
		List<String> list2 = new ArrayList<>();
		
		// List ������
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		for(String str : list2) {
			System.out.print(str + ", ");
		}
		System.out.println("\n");
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�ѱ�", 1000));
		list3.add(new Apple("�Ϻ�", 1000));
		list3.add(new Apple("�븸", 1000));

		Apple apple = list3.get(0);
		apple.toString();
		
		list3.get(2).toString();
		
		list3.get(3).toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
