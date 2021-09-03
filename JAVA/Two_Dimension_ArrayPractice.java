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
		// score 배열의 길이 --> 참조변수를 모아 놓은 배열의 길이
		
		int sum = 0; // 이차원 배열의 각 요소를 더한 값을 저장할 변수
		
		// 이차원 배열의 경우 이중 반복문(이중 for문)을 사용하여야한다.
        // 아래의 형식은 아예 외우는게 좋다.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum : " + sum);
	}
}