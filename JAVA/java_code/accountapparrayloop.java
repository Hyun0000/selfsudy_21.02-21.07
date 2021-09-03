public class accountapparrayloop {
	public static void main(String[] args) {
		double money = 10000.0;
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = money*VatRate;
		double TOTAL = money + VAT;
		double ENPENSE = money*expenseRate;
		double INCOME = money - ENPENSE;
		
		System.out.println("Value of Supply : "+money); // 공급가
		System.out.println("VAT : "+ VAT); // 부가가치세
		System.out.println("Total : "+ TOTAL ); // 소비자 지불액 : 공급가 + 부가가치세
		System.out.println("Expense : " + ENPENSE); // 내가 대동강 생수를 팔기위해 지불한 비용
		System.out.println("Income : " + INCOME); // 이익 = (공급가 - 내가 지불한 비용) , 세금은 나의 이익이 아니니까 Income 계산에서 제외한다.
		
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