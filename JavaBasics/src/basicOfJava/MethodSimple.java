package basicOfJava;

public class MethodSimple {

	public static void main(String[] args) {
		System.out.println("Checking a Simple Method:");
		testmethod();
	}
	
	public static void testmethod() {
		System.out.println("This statement will be printed using testmethod()");
		test2();
	}
	
	public static void test2() {
		System.out.println("This method will be called from another method");
	}

}
