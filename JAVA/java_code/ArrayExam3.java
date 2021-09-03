package Array;

import java.util.Arrays;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		// 배열의 길이가 5인 int 배열
		
		// 배열의 내용을 출력해 보자
		
		// 1.
		System.out.println(iArr);
		System.out.println("------------------------------");
		
		// 2.
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("------------------------------");
		
		// 3.
		System.out.println(Arrays.toString(iArr));
		System.out.println("------------------------------");
		
		// 4. character배열
		char[] chArr = {'a', 'b', 'c', 'd'};
		System.out.println(chArr);
	}
}
