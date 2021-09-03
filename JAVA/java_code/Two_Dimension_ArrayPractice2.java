package Array;

public class Two_Dimension_ArrayPractice2 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("================================");
		
		// 과목별 총점
		int korT = 0, engT = 0, mathT = 0;
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;   // 개인별 총점
			// for 반복문 한 싸이클 돌면 다시 여기서 sum 값이 초기화
			
			float ave = 0.0f; // 개인별 평균
			// for 반복문 한 싸이클 돌면 다시 여기서 ave 값이 초기화
			
			korT += score[i][0];
			engT += score[i][1];
			mathT += score[i][2];
			System.out.printf("%3d", i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			ave = sum/(float)score[i].length;
			System.out.printf("%5d", sum);
			System.out.printf("%5.0f %n", ave);			
		}
		System.out.println("================================");
		System.out.printf("총점:%5d %5d %5d", korT, engT, mathT);
	}
}