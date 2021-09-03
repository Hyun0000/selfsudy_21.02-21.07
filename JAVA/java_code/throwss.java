import java.io.FileWriter;
import java.io.IOException;

public class throwss {
	public static void main(String[] args) throws IOException {
//	 throw new RuntimeException("무언가 심상치 않은 일이 생겼네요");
	 
	 try {
		FileWriter k = new FileWriter("hello.txt");
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
}