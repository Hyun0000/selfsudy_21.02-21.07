public class accountappif {
	public static void main(String[] args) {
		double money = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = money*VatRate;
		double TOTAL = money + VAT;
		double ENPENSE = money*expenseRate;
		double INCOME = money - ENPENSE;

		double DIV1;
		double DIV2;
		double DIV3;
		
		if(INCOME > 10000.0) {
			DIV1 = INCOME*0.5;
			DIV2 = INCOME*0.3;
			DIV3 = INCOME*0.2;
		} else {
			DIV1 = INCOME*1;
			DIV2 = INCOME*0;
			DIV3 = INCOME*0;
		}
		
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
