public class casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(a);
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // Add cast to 'int'
						   // double형인 1.1을 int 형태로 강제로 바꾸는 코드를 추가해주겠다는 의미
						   // (int) 1.1은 결과적으로 정수 '1'이 된것이다.
		System.out.println(e);
		
		//1 to String
		String h = Integer.toString(1);
		System.out.println(h);
		System.out.println(h.getClass());
	}
}