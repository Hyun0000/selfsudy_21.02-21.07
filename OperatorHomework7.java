package Operator;

import java.util.*;

public class OperatorHomework7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = scanner.nextInt();

		System.out.print("영어 : ");
		int eng = scanner.nextInt();
		
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		int sum = kor + eng + math;
		int iAve = (kor + eng + math) / 3;
		float fAve = (float)iAve;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && fAve >= 60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + fAve);
			System.out.println("합격");
		} else {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + fAve);
			System.out.println("불합격");
		}		
	}
}