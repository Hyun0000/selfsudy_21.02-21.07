package BufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		// 읽은 byte를 저장할 변수
		int data = -1;
		
		// 복사 시작&끝 시간
		long start = 0;
		long end = 0;
		
		
		//---------------Buffer 사용 X---------------
		
		fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\BufferStream\\React.png");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("C:\\radder\\리액트.png");
		
		start = System.currentTimeMillis();
		while ((data=bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("출력스트림에 Buffer를 사용하지 않았을 때 : " + (end-start) + "ms");
		
		//---------------Buffer 사용 O---------------
		
		fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\BufferStream\\React.png");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("C:\\radder\\리액트.png");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while ((data=bis.read()) != -1) {
			bos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();

		System.out.println("출력스트림에 Buffer를 사용했을 때 : " + (end-start) + "ms");
		
	}
}