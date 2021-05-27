package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ��¥ : 2021-05-27
 * �̸� : ������
 * ���� : �ڹ� ���� ����� ��Ʈ�� �ǽ��ϱ�.
 * 
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdate\\Desktop\\test1.txt";
		String path2 = "C:\\Users\\bigdate\\Desktop\\test2.txt";
		
		// ���ϰ� �Է½�Ʈ�� ����
		try {
			// input
			FileInputStream fis = new FileInputStream(path1);
			
			// output
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				
				// ��Ʈ������ ���� ������ �б�
				value = fis.read();
				
				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ������ ����.
					break;
				}
				
				// input
//				char ch = (char)value;
//				System.out.print(ch);
				
				// output
				fos.write(value);
				
			} // while-end
			
			// ��Ʈ�� ����
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("\n���α׷� ����...");
	} // main-end
}
