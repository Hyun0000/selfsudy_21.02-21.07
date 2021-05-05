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
		System.out.println("Value of Supply : "+money); // 공급가
		System.out.println("VAT : "+ getVAT()); // 부가가치세
		System.out.println("Total : "+ getTOTAL() ); // 소비자 지불액 : 공급가 + 부가가치세
		System.out.println("Expense : " + getEXPENSE()); // 내가 대동강 생수를 팔기위해 지불한 비용
		System.out.println("Income : " + getINCOME()); // 이익 = (공급가 - 내가 지불한 비용) , 세금은 나의 이익이 아니니까 Income 계산에서 제외한다.
		System.out.println("Divedend : "+ getDIV1()); // 이익 배당
		System.out.println("Divedend : "+ getDIV2()); // 이익 배당
		System.out.println("Divedend : "+ getDIV3()); // 이익 배당
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