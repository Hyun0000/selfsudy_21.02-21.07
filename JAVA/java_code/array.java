public class array {
	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jin";
		users[2] = "ubin";
		// String[] --> 문자열로 이루어진 배열을 만들것이다.
		// users --> 문자열 배열이라는 datatype을 값으로 하는 변수명
		// [3] --> 담고자 하는 배열의 크기를 지정 (3개를 담을 것이다.)
		// 다수의 프로그래밍 언어에서 개수를 셀때는 1 부터 카운팅하지만
		// 몇번째 자리, 즉 자릿수를 셀때는 0 부터 카운팅한다.
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
//		String[] users = new String[3];
//		users[0] = "egoing";
//		users[1] = "jin";
//		users[2] = "ubin";
		// 이것은 빈 깡통인 배열을 먼저 만든 후 나중에 값을 추가하는 예시이다.
		
		int[] scores = {10, 100, 1000};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores.length);
	}
}