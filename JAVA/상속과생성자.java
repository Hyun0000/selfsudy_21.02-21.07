class cal{
	int v1, v2; // ���� ���Ǵ� ���� �̷��� ������Ѵ�.
	cal (int v1, int v2) {
		System.out.println("�θ� class");
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
		System.out.println("�ڽ� class");
	}
	public int minus () {
		return this.v1 - this.v2;
	}
}	
/////////////////////////////////////
public class ��Ӱ������� {

	public static void main(String[] args) {
		cal c = new cal(2,1);
		cal3 c3 = new cal3(2,1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}
}
/////////////////////////////////////
// this.v1 + v2 = this.v1 + this.v2
// ���� say : �����ϸ� �׷� �ǹ̰� �˴ϴ�. ������ �������� �ʴ°� ���ƿ�.

// int v1, v2;�̶�
// int v1;
// int v2; ���ε��� ���Ŵ� ���� �ǹ��̴�. �������� ������ �� ���̴�.