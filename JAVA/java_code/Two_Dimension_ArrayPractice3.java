package Array;

import java.util.Scanner;

public class Two_Dimension_ArrayPractice3 {
	public static void main(String[] args) {
		String[][] words = {
			{"chair", "의자"},		//  words[0][0], words[0][1]
			{"computer", "컴퓨터"},	//  words[1][0], words[1][1]
			{"integer", "정수"}		//  words[2][0], words[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			// Scanner를 이용해 한 줄씩 받는다.
			String str = scanner.nextLine();
			
			if (str.equals(words[i][1])) {
				System.out.println("정답입니다. \n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. \n", words[i][1]);
			}
		}
		// 1. Run하자마자 "Q1. chair의 뜻은?" --> 이거 나와야 한다.
		// 1-1. Q1이랑 같은 라인에 답 작성 해야함
		// 공백줄
		// 2. 맞으면 --> "정답입니다."
		// 2-1. 틀리면 --> "틀렸습니다. 정답은 의자입니다."
		// 공백줄
		// 3. 2 OR 2-1과 동시에 다음 문제(Q2) 나와야함
	}
}