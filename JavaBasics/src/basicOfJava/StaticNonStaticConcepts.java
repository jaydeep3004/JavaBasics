package basicOfJava;

public class StaticNonStaticConcepts {
	static int x=10; //this is static global variable
	String txt="hello there"; //this is non-static global variable
	
	public static void main(String[] args) {
		String txt="this is local"	; //local variable
		
		//We can call a static Method without any class object.
		stcMehod();
		
		//We need to create Class object to call a non-static method.
		StaticNonStaticConcepts sn=new StaticNonStaticConcepts();
		sn.nonstcMethod();
	}

	public static void stcMehod() {
		System.out.println("This is static method.");
	}
	
	public void nonstcMethod() {
		System.out.println("This is non-static method.");
	}
}
