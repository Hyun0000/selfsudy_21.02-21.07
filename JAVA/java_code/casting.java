public class casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(a);
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // Add cast to 'int'
						   // double���� 1.1�� int ���·� ������ �ٲٴ� �ڵ带 �߰����ְڴٴ� �ǹ�
						   // (int) 1.1�� ��������� ���� '1'�� �Ȱ��̴�.
		System.out.println(e);
		
		//1 to String
		String h = Integer.toString(1);
		System.out.println(h);
		System.out.println(h.getClass());
	}
}