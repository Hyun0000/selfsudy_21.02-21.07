package Etc;

public class VariableChange {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int tmp;  // �� ���� ������ �ϴ� ���� tmp�� ����

		tmp = x;  // 1. x�� ���� tmp�� ����
		x = y;    // 2. y�� ���� x�� ����
		y = tmp;  // 3. tmp�� ���� y�� ����
		
		System.out.println("------------------------");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}