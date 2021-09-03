interface Printable {
	void print();
	// 그냥 method 이름이 print() 인거지 이거 자체가 화면에 출력하는
	// 기능은 없다.
}

interface Calculable{
	double PI = 3.14;
	int sum (int v1, int v2);
}
// 내가 원하는 것은 위의 것이다.
// 나는 sum이라는 이름의 method가 필요하고 이 method는 입력값으로 정수 2개를 받는다.
// 이 method는 출력값 역시 정수이다.
// Calculable --> 위와 같은 조건의 method가 필요하다는 규칙에 대해 이름을 붙이는 것
// 이름은 아무거나 해도 된다.
// interface이기에 이름 앞에 interface 라는 키워드를 붙였다.
// {중괄호}를 통해 Calculable이라는 interface의 범위를 설정했다.

class RealCal implements Calculable, Printable {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("interface 싫어염");
		// interface method의 구체적인 내용은 class에서 구현
	}	
}
// implements Calculable 라고 쓴 이상 Calculable에서 구현하고 있는 method를 동일하게
// 구현해야 한다. 그러지 않으면 컴파일 자체가 되지 않는다.
// interface를 통해 설령 버그는 있을지언정 위의 class가 내가 원하지 않는 형태, 원하지 않는
// 사용 방법을 갖지는 않을 것이다.

class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}
// 가짜 더하기 class를 만들었다.
// interface를 만든 후 내가 만든 가짜 class에 implements Calculable 	
// 라고 입력한 후 컴파일이 됐다면 내가 만든 class가 해당 interface가 규제하고
// 있는 형태를 정확하게 엄수했다는 의미가 된다.

// 실제로
// class DummyCal implements Calculable{
// public int sum(int v1, int v2) {
// return 3;
// } 에서

// public int sum(int v1, int v2) {
// return 3;
// } 을 아예 지워버리거나

// sum() method의 이름을 바꾸면 java 파일의 컴파일 자체가 되지 않는다.

public class interfaceapp {
	public static void main(String[] args) {	
		RealCal c = new RealCal();
		System.out.println(c.sum(2,20));
		System.out.println(c.PI);
		c.print();
	}
}

//class RealCal {
//	public double plus(double v1, double v2, double v3) {
//		return v1+v2+v3;
//	}
//}
//외주에서 보내준 class (더하기 class를 나와는 다른 방식으로 이해했다.)