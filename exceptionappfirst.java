public class exceptionappfirst {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};
		System.out.println(scores[0]);
		try {
		System.out.println(scores[3]);
		System.out.println(2/0);
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산이네요");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값을 왜 찾아요");
		}
		// catch --> try안에 있는 코드를 실행했을 때
		// ArithmeticException이 발생하면 {중괄호}안에 있는
		// System.out.println("잘못된 계산이네요") 코드가 실행되게 해주세여
		
		// 즉. ArithmeticException이 발생했을때 처리해야 하는 작업을
		// {중괄호}안에 넣어놓고 예외가 발생했을 때 그것이 실행되게 해놓고
		// 그 다음의 코드들(3을 출력)을 실행되게 하는 것이다.
		
		// e는 변수이다. 아무거나 써도 되는데 주로 e 를 쓴다.
		System.out.println(3);
	}
}