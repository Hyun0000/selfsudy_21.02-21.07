package Etc;

class Card{
	String kind; // ���� (iv)
	int number; // ���� (iv)
	
	static int width = 100;   // �� (cv)
	static int height = 250;  // ���� (cv)
}

public class IV_CV {
	public static void main(String[] args) {		
		Card c = new Card(); // ��ü ����
		Card c2 = new Card();
		
		// ��ü ���
		c.kind = "Heart"; // iv ���
		c.number = 5;     // iv ���
		c.width = 200; 	  // cv ���
		c.height = 300;   // cv ���
	}
}