package Etc;

class Card{
	String kind; // 무늬 (iv)
	int number; // 숫자 (iv)
	
	static int width = 100;   // 폭 (cv)
	static int height = 250;  // 높이 (cv)
}

public class IV_CV {
	public static void main(String[] args) {		
		Card c = new Card(); // 객체 생성
		Card c2 = new Card();
		
		// 객체 사용
		c.kind = "Heart"; // iv 사용
		c.number = 5;     // iv 사용
		c.width = 200; 	  // cv 사용
		c.height = 300;   // cv 사용
	}
}