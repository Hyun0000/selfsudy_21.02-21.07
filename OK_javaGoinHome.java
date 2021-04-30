import org.opentutorials.iot.Elevator; // import는 '불러오다'라는 의미
									   // Elevator라는 class를 불러오겠다는 의미
									   // 그래서 밑에는 Elevator만 쓰면 된다.
									   // Elevator = org.opentutorials.iot.Elevator by import
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OK_javaGoinHome {
	public static void main(String[] args) {
		String id = "JAVA APT 507"; // 반복되는 문자열을 변수 처리 했다.
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		// 내가 위로 올라갈 것이기에 엘리베이터를 1층으로 호출하는 것
		// 해석 : 우리집으로 올라가기 위해 엘리베이터를 1층으로 보내라고 엘리베이터한테 명령하는 것
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on 
		Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
		hallLamp.on();
	}
}