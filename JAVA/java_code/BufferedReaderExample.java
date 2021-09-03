package BufferStream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		
		// console�� �Էµ� ���ڸ� �о���̴� InPutStream
		InputStream is = System.in;
		
		// InputStreamReader�� byte��� Stream�� ���� ��� Stream���� ��ȯ���ش�.
		Reader reader = new InputStreamReader(is);
		
		// Reader�� �Է� ���� ����� ���� BufferedReader�� ����
		// BufferedReader�� ���� ��� Stream�� Buffer�� �����Ѵ�.
		BufferedReader br = new BufferedReader(reader);
		
		// ���� InputStream�� ����� ���� ��Ʈ���� 2���̴�.
		// 1. InputStreamReader
		// 2. BufferedReader
		
		System.out.print("�Է� : ");
		// println�� �ƴ϶� print�� ����߱⿡ "�Է� : " �ٷ� �ڿ� Ÿ���� �� �� �ִ�.
		
		String lineString = br.readLine();
		// BufferedReader�� ����ϸ� �Է��� line(�� ��) ��ü�� �о��ִ�
		// readLine() method�� ��� �� �� �ִ�.
		
		System.out.println("��� : " + lineString);
		
		br.close();
		reader.close();
		is.close();
	}
}