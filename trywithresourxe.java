import java.io.FileWriter;
import java.io.IOException;

public class trywithresourxe {
	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("datatype.txt")) {
			f.write("byeworld");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ������ try {} �ε� �ش� �������� try () {} �� ���´�.
		// �̶� (��ȣ)�ȿ� closeable�� ���Ѿ� �Ǵ� �ڵ带 �ִ´�.
		// �� �� ������ �ڵ带 {�߰�ȣ} �ȿ� �ִ´�.
	}
}