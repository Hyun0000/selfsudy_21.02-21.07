package Array;

import java.util.Arrays;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		// �迭�� ���̰� 5�� int �迭
		
		// �迭�� ������ ����� ����
		
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
		
		// 4. character�迭
		char[] chArr = {'a', 'b', 'c', 'd'};
		System.out.println(chArr);
	}
}
