public class accountapparray {
	public static void main(String[] args) {
		double money = 50000.0;
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = money*VatRate;
		double TOTAL = money + VAT;
		double ENPENSE = money*expenseRate;
		double INCOME = money - ENPENSE;
				
		double[] divrates = new double[3];
		divrates[0] = 0.5;
		divrates[1] = 0.3;
		divrates[2] = 0.2;
		double DIV1 = INCOME * divrates[0];
		double DIV2 = INCOME * divrates[1];
		double DIV3 = INCOME * divrates[2];
		
		System.out.println("Value of Supply : "+money); // ���ް�
		System.out.println("VAT : "+ VAT); // �ΰ���ġ��
		System.out.println("Total : "+ TOTAL ); // �Һ��� ���Ҿ� : ���ް� + �ΰ���ġ��
		System.out.println("Expense : " + ENPENSE); // ���� �뵿�� ������ �ȱ����� ������ ���
		System.out.println("Income : " + INCOME); // ���� = (���ް� - ���� ������ ���) , ������ ���� ������ �ƴϴϱ� Income ��꿡�� �����Ѵ�.
		System.out.println("Divedend : "+ DIV1); // ���� ���
		System.out.println("Divedend : "+ DIV2); // ���� ���
		System.out.println("Divedend : "+ DIV3); // ���� ���
	}
}