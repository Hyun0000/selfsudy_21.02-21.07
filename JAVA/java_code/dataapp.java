public class dataapp {
	public static void main(String[] args) {
		System.out.println(56); // Number 데이터 표현
		System.out.println("six"); // String 데이터 표현
		System.out.println("6"); // String 데이터 표현
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66 여기서 +는 더하기가 아니라 문자열을 위한 결합연산자이다.
		System.out.println(6*6);
//		System.out.println("6"*"6"); // 문자열 데이터 타입은 곱하기 연산을 할 수 없는 것이다.
		System.out.println("1111".length()); // 결과값 : 4, length()는 문자열의 길이를 알려주는 일종의 연산
//		System.out.println(1111.length()); // 숫자의 길이를 알려주는 연산은 기본적으로 없다. 
	}
}