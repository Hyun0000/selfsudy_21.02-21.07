package Array;

public class ArraySum {
	public static void main(String[] args) {
		int sum = 0;       // ������ �����ϱ� ���� ����
		float average = 0; // ����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// �ݺ����� �̿��ؼ� �迭�� ����� �ִ� ������ ��� ���Ѵ�.
		
		average = sum / (float)score.length;
		// (float)score.length --> ��� ����� float Ÿ������ ��� ���� ����ȯ�� �ߴ�.
		// (float)score.length ��� '5'�� �� ���� ������ �迭�� ����(ũ��)�� ���� �� �ֱ⿡
		// ��� '5' ��� (float)score.length�� ���°� �� ���� �ڵ��̴�.
		
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
	}
}