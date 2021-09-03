import java.io.FileWriter;
import java.io.IOException;

public class Ffinally {
	public static void main(String[] args) {
		FileWriter f = null;
		// null�� ���� ���ٶ�� �� (java�� Ư���� datatype)
		// ������ f �� ���� ���ٶ�� ���̴�.
		// ���� [ f = new FileWriter("data.txt"); ]�� ����Ǹ�
		// ������ f �� ���� �ִ� ���°� �� ���̴�. (f �� null�� �ƴ� ���̴�.)
		try {
			f = new FileWriter("data.txt");
			f.write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���� f�� null�� �ƴ϶�� close() �� �������ּ���
			if(f != null) {
				// == �� ���İ� ����� ���̰�
				// != �� ���� �ʳİ� ����� ���̴�. (���� �ʴٸ�)
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}