package Casting;

import java.util.*;

public class CastingHomework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char c = scanner.next().charAt(0);
		
		int A_unicode  = (int)c;
		System.out.println(A_unicode);
	}

}
