package Array;

public class ArrayExam1 {
	public static void main(String[] args) {
		int[] score;        // 1. score��� �̸��� �迭�� ����(�������� ����)
		score = new int[5]; // 2. �迭�� ���� (int ������� X 5)(������ �迭�� �ּҸ� score��� ���������� ����)
		
		// ���� �� ������ �� �������� ���̸� �Ʒ��� ����.
		// int[] score = new int[5]; --> �迭�� ����� ������ ���ÿ�
		
		score[3] = 100;
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		System.out.println("score[3] : " + score[3]);
		System.out.println("score[4] : " + score[4]);
		
		System.out.println("--------------------------------------------------");
		
		int value = score[3];
		System.out.println("value : " + value);
		
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			int j = score[i];
			System.out.println("score" + "[" + i + "]" + " : " + j);
		}
		
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("score" + "[" + i + "]" + " : " + score[i]);
		}
	}
}