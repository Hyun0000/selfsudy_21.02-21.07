import java.io.FileWriter;
import java.io.IOException;

public class Ffinally {
	public static void main(String[] args) {
		FileWriter f = null;
		// null은 값이 없다라는 뜻 (java의 특수한 datatype)
		// 지금은 f 가 값이 없다라는 뜻이다.
		// 만약 [ f = new FileWriter("data.txt"); ]가 실행되면
		// 이제는 f 의 값이 있는 상태가 된 것이다. (f 는 null이 아닌 것이다.)
		try {
			f = new FileWriter("data.txt");
			f.write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 만약 f가 null이 아니라면 close() 를 실행해주세염
			if(f != null) {
				// == 는 같냐고 물어보는 것이고
				// != 는 같지 않냐고 물어보는 것이다. (같지 않다면)
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}