package Array;

import java.util.Arrays;

public class Two_Dimension_ArrayPractice {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		System.out.println(score.length);
		// score �迭�� ���� --> ���������� ��� ���� �迭�� ����
		
		int sum = 0; // ������ �迭�� �� ��Ҹ� ���� ���� ������ ����
		
		// ������ �迭�� ��� ���� �ݺ���(���� for��)�� ����Ͽ����Ѵ�.
        // �Ʒ��� ������ �ƿ� �ܿ�°� ����.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum : " + sum);
	}
}