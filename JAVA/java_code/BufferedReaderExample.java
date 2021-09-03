package BufferStream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		
		// console에 입력된 문자를 읽어들이는 InPutStream
		InputStream is = System.in;
		
		// InputStreamReader는 byte기반 Stream을 문자 기반 Stream으로 변환해준다.
		Reader reader = new InputStreamReader(is);
		
		// Reader의 입력 성능 향상을 위해 BufferedReader를 연결
		// BufferedReader는 문자 기반 Stream에 Buffer를 제공한다.
		BufferedReader br = new BufferedReader(reader);
		
		// 현재 InputStream에 연결된 보조 스트림은 2개이다.
		// 1. InputStreamReader
		// 2. BufferedReader
		
		System.out.print("입력 : ");
		// println이 아니라 print을 사용했기에 "입력 : " 바로 뒤에 타이핑 할 수 있다.
		
		String lineString = br.readLine();
		// BufferedReader를 사용하면 입력한 line(한 행) 전체를 읽어주는
		// readLine() method를 사용 할 수 있다.
		
		System.out.println("출력 : " + lineString);
		
		br.close();
		reader.close();
		is.close();
	}
}