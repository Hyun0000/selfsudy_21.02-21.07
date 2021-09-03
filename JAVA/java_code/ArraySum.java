package Array;

public class ArraySum {
	public static void main(String[] args) {
		int sum = 0;       // 총합을 저장하기 위한 변수
		float average = 0; // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// 반복문을 이용해서 배열에 저장돼 있는 값들을 모두 더한다.
		
		average = sum / (float)score.length;
		// (float)score.length --> 계산 결과를 float 타입으로 얻기 위해 형변환을 했다.
		// (float)score.length 대신 '5'를 쓸 수도 있지만 배열의 길이(크기)가 변할 수 있기에
		// 상수 '5' 대신 (float)score.length를 쓰는게 더 좋은 코드이다.
		
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
	}
}