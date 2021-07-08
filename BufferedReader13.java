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
                // Buffer에 미리 읽어와서 담아놨기 때문에 한 줄 단위로 읽기 작업을 할 수 있다.
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