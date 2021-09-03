package Variable;

import java.util.*;

public class VariableHomeWork1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		
		System.out.print("성별을 입력하세요(남자/여자) : ");
		String gender = scanner.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		float key = scanner.nextFloat();
		
		System.out.printf("키 %.1fcm인 %d살 %s %s 반갑습니다.^^", key, age, gender, name);
	}

}
