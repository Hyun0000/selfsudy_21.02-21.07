package Array;

public class ArrayExam1 {
	public static void main(String[] args) {
		int[] score;        // 1. score라는 이름의 배열을 선언(참조변수 선언)
		score = new int[5]; // 2. 배열의 생성 (int 저장공간 X 5)(생성된 배열의 주소를 score라는 참조변수에 저장)
		
		// 위의 두 문장을 한 문장으로 줄이면 아래와 같다.
		// int[] score = new int[5]; --> 배열의 선언과 생성을 동시에
		
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