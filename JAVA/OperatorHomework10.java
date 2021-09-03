package Operator;

import java.util.Scanner;

public class OperatorHomework10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력1 : ");
		int input1 = scanner.nextInt();
		
		System.out.print("입력2 : ");
		int input2 = scanner.nextInt();
		
		System.out.print("입력3 : ");
		int input3 = scanner.nextInt();
		
		if (input1 == input2 && input1 == input3 && input2 == input3) {
			System.out.println("true");
		} else {
			System.out.println("flase");
		}
	}
}
