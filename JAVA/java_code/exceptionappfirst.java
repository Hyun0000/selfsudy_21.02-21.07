public class exceptionappfirst {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		System.out.println(scores[0]);
		try{
			System.out.println(2);
//			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("����� �� �� �Ƴ׿�"+e.getMessage());
//			e.printStackTrace();
		}
		  catch(Exception e) {
			System.out.println("�ڵ尡 �� �����׿�");
		}
		System.out.println(5);
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