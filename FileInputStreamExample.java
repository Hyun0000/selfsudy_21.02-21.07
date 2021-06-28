package FileIO;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// FileInPutStream ��ü ����
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\k1010\\Desktop\\Javaeclipse\\src\\FileIO\\FileInputStreamExample.java");
			
			// �� byte�� �о console�� ����ϴ� �ڵ带 �ۼ��غ���.
			
			// ���� byte�� ������ data��� ������ �����ߴ�.
			int data;

			
			// while���� �ۼ��� �ݺ������� ���� ���̴�.
			// read method�� �� byte�� �о��ִ� method�̴�.
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
