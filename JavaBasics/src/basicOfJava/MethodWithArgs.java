package basicOfJava;

public class MethodWithArgs {

	public static void main(String[] args) {
		System.out.println("Method with args example:");
		product("Samsung");
		checklist(11);
	}
	
	public static void product(String prd) {
		System.out.println("This will print argument where the method is called: " +prd);
	}
	
	public static void checklist(int b) {
	
		if(b>10) {
			System.out.println("Value is higher than 10");
		}
		else {
			System.out.println("Value is lower than 10");
		}
	}
}
