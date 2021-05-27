package sub1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;

import jdk.internal.net.http.BufferingSubscriber;

/*
 * ��¥ : 2021-05-27
 * �̸� : ������
 * ���� : �ڹ� ���� ����� ��Ʈ�� �ǽ��ϱ�.
 * 
 */
public class BufferFileIOTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdate\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\bigdate\\Desktop\\sample2.jpg";
		
		// ���ϰ� �Է½�Ʈ�� ����
		try {
			
			
			// ���۽�Ʈ�� ���� (buffer = ���ӷ��Ϲ��)
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedInputStream bos = new BufferedInputStream(new FileOutputStream(path2));
			
			
			int value = 0;
			
			while(true) {
				
				// ��Ʈ������ ���� ������ �б�
				value = bis.read();
				
				if (value == -1) {
					// �� �̻� ���� �����Ͱ� ������ ����.
					break;
				}
				
				// input
//				char ch = (char)value;
//				System.out.print(ch);
				
				// output
				bos.write(value);
				
			} // while-end
			
			// ��Ʈ�� ����
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("\n���α׷� ����...");
	} // main-end
}
