package sub1;
/*
 * ��¥ : 2021-05-26
 * �̸� : ������
 * ���� : GenericTest Ŭ���� �ǽ��ϱ�
 */
public class GenericTest {

	public static void main(String[] args) {
		
		Apple apple = new Apple("�ѱ�", 2000);
		Banana banana = new Banana("�븸", 3000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
		
		
		
		
	}
}
