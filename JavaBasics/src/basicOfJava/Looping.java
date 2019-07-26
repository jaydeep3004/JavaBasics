package basicOfJava;

public class Looping {

	public static void main(String[] args) {
		//Do-While loop
		System.out.println("******Do...while loop******");
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		System.out.println("And finally " + i);
		
		//While loop - Increment
		System.out.println("******While loop - Increment******");
		int i1 = 1;
		while(i1<=10)
		{
			System.out.println(i1);
			i1++;
		}
		System.out.println("And Finally... " +i1);
		i1--;
		
		//While loop - Increment
		System.out.println("******While loop - Decrement******");
		while(i1>=0)
		{
			System.out.println(i1);
			i1--;
		}
		System.out.println("And Finally..." +i1);
		//For loop
		System.out.println("******For loop******");
		int j;
		for(j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		System.out.println("Finally after for loop terminates "+j);
	}

}
