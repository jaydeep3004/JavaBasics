package basicOfJava;

public class MethodWithReturnTye {

	public static void main(String[] args) {
		System.out.println("Method with return type:");
		System.out.println(checklist1());
		System.out.println(getTotal(10, 5));
	}
	
	public static boolean checklist1() {
		int a = 11;
		if(a==10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int getTotal(int a,int b) {
		int total = a + b;
		return total;
	}

}
