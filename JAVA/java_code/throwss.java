import java.io.FileWriter;
import java.io.IOException;

public class throwss {
	public static void main(String[] args) throws IOException {
//	 throw new RuntimeException("���� �ɻ�ġ ���� ���� ����׿�");
	 
	 try {
		FileWriter k = new FileWriter("hello.txt");
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
}