package Array;

public class sumaveragepracticce {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int sum = 0;
		double ave = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		ave = sum / (double)score.length;
		
		System.out.println("sum : " + sum);
		System.out.println("ave : " + ave);
	}

}
