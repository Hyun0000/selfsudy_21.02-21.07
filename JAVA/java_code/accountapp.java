public class accountapp {
	public static void main(String[] args) {
		double money = 10000.0;
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = money*VatRate;
		double TOTAL = money + VAT;
		double ENPENSE = money*expenseRate;
		double INCOME = money - ENPENSE;
		double DIV1 = INCOME*0.5;
		double DIV2 = INCOME*0.3;
		double DIV3 = INCOME*0.2;
		
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
