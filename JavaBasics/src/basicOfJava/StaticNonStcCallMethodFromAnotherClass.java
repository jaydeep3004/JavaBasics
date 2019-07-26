package basicOfJava;

public class StaticNonStcCallMethodFromAnotherClass {

	public static void main(String[] args) {
		//Static method/variables can be called with ClassName.MethodName
		
		StaticNonStaticConcepts.stcMehod();
		System.out.println(StaticNonStaticConcepts.x);
		
		//To call non-static method/variables from different class, we still need to create an object of that class.
		
		StaticNonStaticConcepts sn=new StaticNonStaticConcepts();
		sn.nonstcMethod();
		System.out.println(sn.txt);
	}

}
