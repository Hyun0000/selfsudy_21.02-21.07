package FileIOtraining;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader13 {

	public static void main(String[] args) {
		String path = String.valueOf("C:\\radder\\FileIOFolder\\file2.txt");
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			
			while (true) {
				String strReadLine = bufferedReader.readLine();
                // Buffer�� �̸� �о�ͼ� ��Ƴ��� ������ �� �� ������ �б� �۾��� �� �� �ִ�.
				if (strReadLine == null) {
					break;
				}
				System.out.println(strReadLine);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}