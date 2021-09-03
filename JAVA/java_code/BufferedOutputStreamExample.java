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
		
		// ���� byte�� ������ ����
		int data = -1;
		
		// ���� ����&�� �ð�
		long start = 0;
		long end = 0;
		
		
		//---------------Buffer ��� X---------------
		
		fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\BufferStream\\React.png");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("C:\\radder\\����Ʈ.png");
		
		start = System.currentTimeMillis();
		while ((data=bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("��½�Ʈ���� Buffer�� ������� �ʾ��� �� : " + (end-start) + "ms");
		
		//---------------Buffer ��� O---------------
		
		fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\BufferStream\\React.png");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("C:\\radder\\����Ʈ.png");
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

		System.out.println("��½�Ʈ���� Buffer�� ������� �� : " + (end-start) + "ms");
		
	}
}