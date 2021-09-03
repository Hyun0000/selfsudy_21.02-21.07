package FileIOtraining;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExam12 {

	public static void main(String[] args) {
		String path = String.valueOf("C:\\radder\\FileIOFolder\\file2.txt");
		
		BufferedOutputStream bufferedOutputStream = null;
		
		try {
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
			
			bufferedOutputStream.write('b');
			bufferedOutputStream.write('a');
			bufferedOutputStream.write('n');
			bufferedOutputStream.write('k');
			bufferedOutputStream.write('.');
			bufferedOutputStream.write('\r');
			bufferedOutputStream.write('\n');

			bufferedOutputStream.write("deposite and withdrawal.".getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}