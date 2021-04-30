import org.opentutorials.iot.Elevator; // import�� '�ҷ�����'��� �ǹ�
									   // Elevator��� class�� �ҷ����ڴٴ� �ǹ�
									   // �׷��� �ؿ��� Elevator�� ���� �ȴ�.
									   // Elevator = org.opentutorials.iot.Elevator by import
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OK_javaGoinHome {
	public static void main(String[] args) {
		String id = "JAVA APT 507"; // �ݺ��Ǵ� ���ڿ��� ���� ó�� �ߴ�.
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		// ���� ���� �ö� ���̱⿡ ���������͸� 1������ ȣ���ϴ� ��
		// �ؼ� : �츮������ �ö󰡱� ���� ���������͸� 1������ ������� �������������� ����ϴ� ��
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on 
		Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
		hallLamp.on();
	}
}