public class array {
	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jin";
		users[2] = "ubin";
		// String[] --> ���ڿ��� �̷���� �迭�� ������̴�.
		// users --> ���ڿ� �迭�̶�� datatype�� ������ �ϴ� ������
		// [3] --> ����� �ϴ� �迭�� ũ�⸦ ���� (3���� ���� ���̴�.)
		// �ټ��� ���α׷��� ���� ������ ������ 1 ���� ī����������
		// ���° �ڸ�, �� �ڸ����� ������ 0 ���� ī�����Ѵ�.
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
//		String[] users = new String[3];
//		users[0] = "egoing";
//		users[1] = "jin";
//		users[2] = "ubin";
		// �̰��� �� ������ �迭�� ���� ���� �� ���߿� ���� �߰��ϴ� �����̴�.
		
		int[] scores = {10, 100, 1000};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores.length);
	}
}