package sub3;

/*
 * ��¥ : 2021-05-25
 * �̸� : ������
 * ���� : �ڹ� ������ �ǽ��ϱ�
 * 
 * ������(Polymorphism)
 *  - ��Ӱ��迡 �ִ� �θ�Ŭ������ ��ü���� ����� �ڽ�Ŭ�������� �ٽ� �������ϴ� ���
 *  - �θ�Ŭ���� Ÿ������ ��ü�� �����ϴ� ��
 *  - ������ ������ �̿��ؼ� ���α׷��� �ڵ��� �������� ����
 *  
 */
public class PolyTest {

	public static void main(String[] args) {
		// �������� ������ ��ü ����
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		// �������� Ȱ���� ��ü �迭
		Tiger obj1 = new Tiger();
		Eagle obj2 = new Eagle();
		Shark obj3 = new Shark();
		
		Animal object[] = {obj1, obj2, obj3};
		
		for(Animal obj : object) {
			obj.move();
			obj.hunt();
		}
	}
}









