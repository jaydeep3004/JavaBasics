package practice;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 101;
		
		//marks between 91 t0 100-> Grade A
		//marks between 71 t0 90-> Grade B
		//marks between 51 t0 70-> Grade C
		//marks <=50-> Fail
		
		if(marks>=91 & marks<=100)
		{
			System.out.println("Grade A: " + marks);
		}
		else if(marks>=71 & marks<=90)
		{
			System.out.println("Grade B: " + marks);
		}
		else if(marks>=51 & marks<=70)
		{
			System.out.println("Grade C: " + marks);
		}
		else if(marks>100)
		{
			System.out.println("Invalid marks: " + marks);
		}
		else
		{
			System.out.println("Fail: " + marks);
		}
	}

}
