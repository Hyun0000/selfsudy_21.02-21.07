public class accountapparrayloop {
	public static void main(String[] args) {
		double money = 10000.0;
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = money*VatRate;
		double TOTAL = money + VAT;
		double ENPENSE = money*expenseRate;
		double INCOME = money - ENPENSE;
		
		System.out.println("Value of Supply : "+money); // ���ް�
		System.out.println("VAT : "+ VAT); // �ΰ���ġ��
		System.out.println("Total : "+ TOTAL ); // �Һ��� ���Ҿ� : ���ް� + �ΰ���ġ��
		System.out.println("Expense : " + ENPENSE); // ���� �뵿�� ������ �ȱ����� ������ ���
		System.out.println("Income : " + INCOME); // ���� = (���ް� - ���� ������ ���) , ������ ���� ������ �ƴϴϱ� Income ��꿡�� �����Ѵ�.
		
		double[] divrates = new double[3];
		divrates[0] = 0.5;
		divrates[1] = 0.3;
		divrates[2] = 0.2;
		
		int i = 0;
		while(i < divrates.length) {
			System.out.println("Divedend : "+ (INCOME*divrates[i]));
			i = i + 1;
		}
	}
}