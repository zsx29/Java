package sub1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;

import jdk.internal.net.http.BufferingSubscriber;

/*
 * 날짜 : 2021-05-27
 * 이름 : 박재형
 * 내용 : 자바 파일 입출력 스트림 실습하기.
 * 
 */
public class BufferFileIOTest {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdate\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\bigdate\\Desktop\\sample2.jpg";
		
		// 파일과 입력스트림 연결
		try {
			
			
			// 버퍼스트림 생성 (buffer = 가속로켓배송)
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedInputStream bos = new BufferedInputStream(new FileOutputStream(path2));
			
			
			int value = 0;
			
			while(true) {
				
				// 스트림으로 부터 데이터 읽기
				value = bis.read();
				
				if (value == -1) {
					// 더 이상 읽을 데이터가 없을때 종료.
					break;
				}
				
				// input
//				char ch = (char)value;
//				System.out.print(ch);
				
				// output
				bos.write(value);
				
			} // while-end
			
			// 스트림 해제
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("\n프로그램 종료...");
	} // main-end
}
