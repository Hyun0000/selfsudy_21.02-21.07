class foo{
	public static String classvar = "i classvar";
	public String instancevar  = "i instancevar";
	public static void classmethod() {
		System.out.println(classvar);
//		System.out.println(instancevar);
	}
	public void instancemethod() {
		System.out.println(classvar);
		System.out.println(instancevar);
	}
	
}
public class staticapp {
	public static void main(String[] args) {
	 System.out.println(foo.classvar);
//	 System.out.println(foo.instancevar);
	 
	 foo.classmethod();
//	 foo.instancemethod();
	 
	 foo f1 = new foo();
	 foo f2 = new foo();
	}
}