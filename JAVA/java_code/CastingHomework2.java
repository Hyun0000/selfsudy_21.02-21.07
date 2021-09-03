package Casting;

import java.util.*;

public class CastingHomework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float kor = scanner.nextFloat();
		
		System.out.print("영어 : ");
		float eng = scanner.nextFloat();
		
		System.out.print("수학 : ");
		float math = scanner.nextFloat();
		
		int total = (int)(kor + eng + math);
		int ave = (int)(kor + eng + math) / 3 ;
		
		System.out.println("국어 : " + kor);
		System.out.println("국어 : " + eng);
		System.out.println("국어 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ave);
	}
}