package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 날짜 : 2021-05-27
 * 이름 : 박재형
 * 내용 : 자바 파일 입출력 스트림 실습하기.
 * 
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdate\\Desktop\\test1.txt";
		String path2 = "C:\\Users\\bigdate\\Desktop\\test2.txt";
		
		// 파일과 입력스트림 연결
		try {
			// input
			FileInputStream fis = new FileInputStream(path1);
			
			// output
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				
				// 스트림으로 부터 데이터 읽기
				value = fis.read();
				
				if (value == -1) {
					// 더 이상 읽을 데이터가 없을때 종료.
					break;
				}
				
				// input
//				char ch = (char)value;
//				System.out.print(ch);
				
				// output
				fos.write(value);
				
			} // while-end
			
			// 스트림 해제
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("\n프로그램 종료...");
	} // main-end
}
