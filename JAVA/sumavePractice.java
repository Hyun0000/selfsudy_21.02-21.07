package Array;

public class sumavePractice {
	public static void main(String[] args) {
		int[] score = {100, 88, 100, 100, 90};
		
		int sum = 0;
		float ave = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		ave = sum / (float)score.length;
		
		System.out.println("sum : " + sum);
		System.out.println("ave : " + ave);
	}
}