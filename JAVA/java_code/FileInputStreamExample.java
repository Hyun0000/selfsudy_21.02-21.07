package FileIO;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
		// FileInPutStream 객체 생성
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\FileIO\\FileInputStreamExample.java");
			
			// 한 byte씩 읽어서 console에 출력하는 코드를 작성해보자.
			
			
			// 읽은 byte를 저장할 data라는 변수를 설정했다.
			int data;

			// while문을 작성해 반복적으로 읽을 것이다.
			// read() method는 한 byte씩 읽어주는 method이다.
			while((data = fis.read()) != -1) {
			// 변수 data에 FileInputStream에서 읽은 한 byte의 데이터를 저장한다.
			// [data = fis.read()) != -1] --> data가 -1 값이 아니라면(!=)
			// = 즉, data를 읽었다면
			// FileInputStreamExample.java 파일의 끝을 읽으면 data는 -1이 되고 while문을 빠져나간다.
				
				System.out.write(data);
			// write() method --> data를 읽고나서 출력해준다.
			// [System.out] --> OupPutStream type
			}

			System.out.flush();
			// write() method를 쓰면 항상 flush() method를 호출해야한다.
			// cf) main() method가 끝나면 프로그램이 종료되기 때문에
			// [System.out.write(data);]이 가지고 있는 버퍼는 자동적으로 비워진다.
			// 이럴 경우 꼭 flush() method를 사용할 필요는 없다.
			
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
