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
		
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("================================");
		
		// ���� ����
		int korT = 0, engT = 0, mathT = 0;
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;   // ���κ� ����
			// for �ݺ��� �� ����Ŭ ���� �ٽ� ���⼭ sum ���� �ʱ�ȭ
			
			float ave = 0.0f; // ���κ� ���
			// for �ݺ��� �� ����Ŭ ���� �ٽ� ���⼭ ave ���� �ʱ�ȭ
			
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
		System.out.printf("����:%5d %5d %5d", korT, engT, mathT);
	}
}