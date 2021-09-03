package Array;

import java.util.Scanner;

public class Two_Dimension_ArrayPractice3 {
	public static void main(String[] args) {
		String[][] words = {
			{"chair", "����"},		//  words[0][0], words[0][1]
			{"computer", "��ǻ��"},	//  words[1][0], words[1][1]
			{"integer", "����"}		//  words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			// Scanner�� �̿��� �� �پ� �޴´�.
			String str = scanner.nextLine();
			
			if (str.equals(words[i][1])) {
				System.out.println("�����Դϴ�. \n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. \n", words[i][1]);
			}
		}
		// 1. Run���ڸ��� "Q1. chair�� ����?" --> �̰� ���;� �Ѵ�.
		// 1-1. Q1�̶� ���� ���ο� �� �ۼ� �ؾ���
		// ������
		// 2. ������ --> "�����Դϴ�."
		// 2-1. Ʋ���� --> "Ʋ�Ƚ��ϴ�. ������ �����Դϴ�."
		// ������
		// 3. 2 OR 2-1�� ���ÿ� ���� ����(Q2) ���;���
	}
}