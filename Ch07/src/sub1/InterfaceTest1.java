package sub1;
/*
 * ��¥ : 2021-05-25
 * �̸� : ������
 * ���� : �ڹ� �������̽� �ǽ��ϱ�.
 *  - �߻�޼��常 �����
 */
public class InterfaceTest1 {

	public static void main(String[] args) {
		// �������̽� - Ŭ���� ������ ǥ�� ���̵� ������ �Ѵ�.
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.chDown();
	}
}
