package FileIO;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// FileInPutStream 객체 생성
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\FileIO\\FileInputStreamExample.java");
			
			// 한 byte씩 읽어서 console에 출력하는 코드를 작성해보자.
			
			// 읽은 byte를 저장할 data라는 변수를 설정했다.
			int data;

			
			// while문을 작성해 반복적으로 읽을 것이다.
			// read method는 한 byte씩 읽어주는 method이다.
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}

			System.out.flush();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
