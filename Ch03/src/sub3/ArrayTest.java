package sub3;
/*
 * ��¥ : 2020-05-17
 * �̸� : ������
 * ���� : �ڹ� array �迭 �ǽ��ϱ�
 * */
public class ArrayTest {

	public static void main(String[] args) {
		
		// �迭
		int nums[] = {1, 2, 3, 4, 5};
				   //[0][1][2][3][4] : index ��
				   // ���� ����Ʈ(�迭 �߰� x)
		
		// �迭 ����
		System.out.println("�迭 nums�� ���� ���� : " + nums.length);
		
		// �迭 ���� ���
		System.out.println("�迭 nums�� 1��° ����" + nums[0]);
		System.out.println("�迭 nums�� 2��° ����" + nums[1]);
		System.out.println("�迭 nums�� 3��° ����" + nums[2]);
		
		// �迭 �ݺ���
		// 1
		for(int num : nums) {
			System.out.println("�迭 nums�� ���� : " + num);
		}
		// 2
		String people[] = {"������","������","�庸��","������","�̼���"};
		
		for(String person : people) {
			System.out.println("people�� ���� : " + person);
			
		}
	}
}
