package sub1;
/*
 * ��¥ : 2021-05-24
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� ��� �ǽ��ϱ�
 */
public class InheritanceTest {

	public static void main(String[] args) {
	
		StockAccount kb = new StockAccount("kb은행", "212-029464-464-0", "박재형", 30000, "삼성전자", 10, 80000);
		kb.sell(5, 79000);
		kb.buy(10, 81000);
		kb.show();
		
	}
}
