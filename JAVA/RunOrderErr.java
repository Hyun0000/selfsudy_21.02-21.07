
public class RunOrderErr {
	public static void main(String[] args) {
			String name = "유병승";		// 변수 선언
			System.out.println(name);	// 변수 사용(활용)
			
			// 변수를 선언할 때는 반드시 변수의 타입(자료형)을 설정해줘야 한다.
			byte c = -128;
			byte d = 127;
			// int가 아니라  byte로 변수(c,d)의 타입(자료형)을 결정한 이유는
			// byte보다 큰 정수를 담지 않겠다는 의미이다.
			
			// 변수는 크게 3가지로 나눌 수 있다.
			// cf) 2~3번을 안하면 변수 선언을 할 필요가 없다.
			
			// 1. 변수 선언
			//	ex) byte c;
			
			// 2. 변수 초기화(최초로 집어 넣는 값)
			//	ex) c = 1;
			
			// 3. 변수 사용(활용)
			// ex1) 값 변경(대입)
			// c = 10;
			// ex2) 값 읽기
			// System.out.println(c);
			// x = c;
			// x라는 변수의 값을 변경 by c라는 변수에서 값을 읽어서
			// x = 1;
			
			// 1. 변수 선언
			boolean b;
			char cc;
			String dd;
			byte e;
			short f;
			int g;
			long h;
			float i;
			double j;
			
			// 2. 변수 초기화(최초로 집어 넣는 값)
			b = true;
			cc = 65;
			System.out.println(cc);
			// 숫자 65에 해당하는 문자를 출력한다.
			// 아스키 코드표의 10진수 참고
			// 여기까지만 char 변수 초기화
			cc = 38;
			System.out.println(cc);
			// 숫자 65에 해당하는 문자를 출력한다.
			// 아스키 코드표의 10진수 참고			
			
			cc = '가';
			System.out.println(cc);
			// char는 "큰 따옴표"로 묶을 수 없다.
			
			cc = 52261;
			System.out.println(cc);
			// char에서 한글은 2byte로 나타낼수 있다.
			// 그렇기에 52261과 같은 큰 숫자가 들어간다.
			
			e = -128;
			f = -32768;
			// short는 컬러를 나타내는 단위로 쓰인다.
			
			// long형의 크기(bit)는 운영체제 or 컴파일러 or jvm에서
			// 운영되는 운영체제의 비트수에 따라 달라진다.
			
			// int형의 크기
			// cf) int --> 2,1~~로 시작하는 10자리 숫자
			
			
			// 실수 계산은 오차 범위를 가지고 있다.
			// 인간의 눈으로 보기에는 간단한 계산일지라도
			// 컴퓨터의 입장에서 실수의 계산은 굉장한 작업을 거쳐야 하는 일이기 때문이다.
			// double은 64bit이기에 float보다는 오차가 적지만
			// 무시할 수 없을 정도로 오차가 있는건 동일하다.
			
			
			i = 2.1f * 1.4f;
			// float는 크기가 작은 실수
			
			j = 4 * 1.4;
			// double은 float 보다 크다.
			
			
			// 3. 변수 사용(활용)
			System.out.println(b);
			System.out.println(e);
			System.out.println(f);
			System.out.println("i : " + i);
			System.out.println(j);
//			System.out.println();
//			System.out.println();
//			System.out.println();
			
			
			// 4. 변수 선언과 초기회를 한번에
			boolean B = true;
			System.out.println(B);
			
			
			
			
			
			// 아래 부분은 강사가 개인적으로 추가한 내용이다.			
			System.out.println("Hello");
			System.out.println("Java");
			System.out.println("Welcome to Java World");
			System.out.print("aaa");
			System.out.print("bbb");
			
			System.out.println(20+7);
			System.out.println("20+7");
	}
}

// println --> ln은 line을 의미한다.
// println("내용") method 안의 "내용"을 출력하고 줄바꿈을 하라는 의미이다.
// print --> 줄 바꿈 없이 그대로 이어 쓴다.

// cf) "큰 따옴표"가 출력되게 하고 싶으면 아래와 같이 입력하면 된다.
// System.out.print("\"bbb\"");
		

//	public class RunOrderErr {
//		public static void main(String[] args) {
//			public class RunOrderErr {
//				public static void main(String[] args) {
//				System.out.println(name);
//				String name="유병승";
//		}
//	}