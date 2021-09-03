public class accountappmethod {
	public static double money;
	public static double VatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		money = 10000.0;
		VatRate = 0.1;
		expenseRate = 0.3;
		print();
	}

	public static void print() {
		System.out.println("Value of Supply : "+money); // ���ް�
		System.out.println("VAT : "+ getVAT()); // �ΰ���ġ��
		System.out.println("Total : "+ getTOTAL() ); // �Һ��� ���Ҿ� : ���ް� + �ΰ���ġ��
		System.out.println("Expense : " + getEXPENSE()); // ���� �뵿�� ������ �ȱ����� ������ ���
		System.out.println("Income : " + getINCOME()); // ���� = (���ް� - ���� ������ ���) , ������ ���� ������ �ƴϴϱ� Income ��꿡�� �����Ѵ�.
		System.out.println("Divedend : "+ getDIV1()); // ���� ���
		System.out.println("Divedend : "+ getDIV2()); // ���� ���
		System.out.println("Divedend : "+ getDIV3()); // ���� ���
	}

	public static double getDIV1() {
		return getINCOME()*0.5;
	}
	
	public static double getDIV2() {
		return getINCOME()*0.3;
	}
	
	public static double getDIV3() {
		return getINCOME()*0.2;
	}

	public static double getINCOME() {
		return money - getEXPENSE();
	}

	public static double getEXPENSE() {
		return money*expenseRate;
	}

	public static double getTOTAL() {
		return money + getVAT();
	}

	public static double getVAT() {
		return money*VatRate;
	}
}