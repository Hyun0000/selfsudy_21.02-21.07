import java.io.FileWriter;
import java.io.IOException;

public class trywithresourxe {
	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("datatype.txt")) {
			f.write("byeworld");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 원래는 try {} 인데 해당 문법에는 try () {} 로 적는다.
		// 이때 (괄호)안에 closeable을 시켜야 되는 코드를 넣는다.
		// 그 후 나머지 코드를 {중괄호} 안에 넣는다.
	}
}