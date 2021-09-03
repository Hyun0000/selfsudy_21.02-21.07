package FileIO;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
		// FileInPutStream ��ü ����
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\FileIO\\FileInputStreamExample.java");
			
			// �� byte�� �о console�� ����ϴ� �ڵ带 �ۼ��غ���.
			
			
			// ���� byte�� ������ data��� ������ �����ߴ�.
			int data;

			// while���� �ۼ��� �ݺ������� ���� ���̴�.
			// read() method�� �� byte�� �о��ִ� method�̴�.
			while((data = fis.read()) != -1) {
			// ���� data�� FileInputStream���� ���� �� byte�� �����͸� �����Ѵ�.
			// [data = fis.read()) != -1] --> data�� -1 ���� �ƴ϶��(!=)
			// = ��, data�� �о��ٸ�
			// FileInputStreamExample.java ������ ���� ������ data�� -1�� �ǰ� while���� ����������.
				
				System.out.write(data);
			// write() method --> data�� �а��� ������ش�.
			// [System.out] --> OupPutStream type
			}

			System.out.flush();
			// write() method�� ���� �׻� flush() method�� ȣ���ؾ��Ѵ�.
			// cf) main() method�� ������ ���α׷��� ����Ǳ� ������
			// [System.out.write(data);]�� ������ �ִ� ���۴� �ڵ������� �������.
			// �̷� ��� �� flush() method�� ����� �ʿ�� ����.
			
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
