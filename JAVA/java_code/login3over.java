public class login3over {
	public static void main(String[] args) {
		String id = "radder";
		String inputID = args[0];
		
		String pw = "1111";
		String inputPW = args[1];
		
	if (inputID.equals(id) && inputPW.equals(pw)) {
		System.out.println("Hi");
		} else {
			System.out.println("bye");
		}
	}
}