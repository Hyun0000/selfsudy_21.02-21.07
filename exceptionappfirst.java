public class exceptionappfirst {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		System.out.println(scores[0]);
		try {
		System.out.println(scores[3]);
		System.out.println(2/0);
		} catch(ArithmeticException e) {
			System.out.println("�߸��� ����̳׿�");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ���� �� ã�ƿ�");
		}
		// catch --> try�ȿ� �ִ� �ڵ带 �������� ��
		// ArithmeticException�� �߻��ϸ� {�߰�ȣ}�ȿ� �ִ�
		// System.out.println("�߸��� ����̳׿�") �ڵ尡 ����ǰ� ���ּ���
		
		// ��. ArithmeticException�� �߻������� ó���ؾ� �ϴ� �۾���
		// {�߰�ȣ}�ȿ� �־���� ���ܰ� �߻����� �� �װ��� ����ǰ� �س���
		// �� ������ �ڵ��(3�� ���)�� ����ǰ� �ϴ� ���̴�.
		
		// e�� �����̴�. �ƹ��ų� �ᵵ �Ǵµ� �ַ� e �� ����.
		System.out.println(3);
	}
}