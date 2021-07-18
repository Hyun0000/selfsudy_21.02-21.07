package Etc;

public class VariableChange {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		int tmp;  // 빈 컵의 역할을 하는 변수 tmp를 생성

		tmp = x;  // 1. x의 값을 tmp에 저장
		x = y;    // 2. y의 값을 x에 저장
		y = tmp;  // 3. tmp의 값을 y에 저장
		
		System.out.println("------------------------");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}