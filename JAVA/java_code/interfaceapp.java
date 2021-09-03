interface Printable {
	void print();
	// �׳� method �̸��� print() �ΰ��� �̰� ��ü�� ȭ�鿡 ����ϴ�
	// ����� ����.
}

interface Calculable{
	double PI = 3.14;
	int sum (int v1, int v2);
}
// ���� ���ϴ� ���� ���� ���̴�.
// ���� sum�̶�� �̸��� method�� �ʿ��ϰ� �� method�� �Է°����� ���� 2���� �޴´�.
// �� method�� ��°� ���� �����̴�.
// Calculable --> ���� ���� ������ method�� �ʿ��ϴٴ� ��Ģ�� ���� �̸��� ���̴� ��
// �̸��� �ƹ��ų� �ص� �ȴ�.
// interface�̱⿡ �̸� �տ� interface ��� Ű���带 �ٿ���.
// {�߰�ȣ}�� ���� Calculable�̶�� interface�� ������ �����ߴ�.

class RealCal implements Calculable, Printable {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("interface �Ⱦ");
		// interface method�� ��ü���� ������ class���� ����
	}	
}
// implements Calculable ��� �� �̻� Calculable���� �����ϰ� �ִ� method�� �����ϰ�
// �����ؾ� �Ѵ�. �׷��� ������ ������ ��ü�� ���� �ʴ´�.
// interface�� ���� ���� ���״� ���������� ���� class�� ���� ������ �ʴ� ����, ������ �ʴ�
// ��� ����� ������ ���� ���̴�.

class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}
// ��¥ ���ϱ� class�� �������.
// interface�� ���� �� ���� ���� ��¥ class�� implements Calculable 	
// ��� �Է��� �� �������� �ƴٸ� ���� ���� class�� �ش� interface�� �����ϰ�
// �ִ� ���¸� ��Ȯ�ϰ� �����ߴٴ� �ǹ̰� �ȴ�.

// ������
// class DummyCal implements Calculable{
// public int sum(int v1, int v2) {
// return 3;
// } ����

// public int sum(int v1, int v2) {
// return 3;
// } �� �ƿ� ���������ų�

// sum() method�� �̸��� �ٲٸ� java ������ ������ ��ü�� ���� �ʴ´�.

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
//���ֿ��� ������ class (���ϱ� class�� ���ʹ� �ٸ� ������� �����ߴ�.)