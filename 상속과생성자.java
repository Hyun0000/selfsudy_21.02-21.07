class cal{
	int v1, v2; // 변수 정의는 원래 이렇게 해줘야한다.
	cal (int v1, int v2) {
		System.out.println("부모 class");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum () {
		return this.v1+this.v2;
	}
}
/////////////////////////////////////
class cal3 extends cal{
	cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("자식 class");
	}
	public int minus () {
		return this.v1 - this.v2;
	}
}	
/////////////////////////////////////
public class 상속과생성자 {

	public static void main(String[] args) {
		cal c = new cal(2,1);
		cal3 c3 = new cal3(2,1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}
}
/////////////////////////////////////
// this.v1 + v2 = this.v1 + this.v2
// 생코 say : 생략하면 그런 의미가 됩니다. 가급적 생략하지 않는게 좋아요.

// int v1, v2;이랑
// int v1;
// int v2; 따로따로 쓴거는 같은 의미이다. 위에꺼는 생략을 한 것이다.