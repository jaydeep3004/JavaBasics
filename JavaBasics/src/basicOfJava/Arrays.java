package basicOfJava;

public class Arrays {

	public static void main(String[] args) {
		
		//One Dimensional array
		
		int ar[] = new int[5];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		//int count = ar.length;
		System.out.println("One Dimensional array:");
		for(int count=0;count<ar.length;count++)
		{
			System.out.println(ar[count]);
		}
		
		//Two Dimensional array
		System.out.println("Two Dimensional array:");
		String str[][] = new String[3][4];
		
		System.out.println("This array has " +str.length +" Rows");
		System.out.println("This array has " +str[0].length +" Columns");
		
		str[0][0] = "A";
		str[0][1] = "B";
		str[0][2] = "C";
		str[0][3] = "D";
		
		str[1][0] = "E";
		str[1][1] = "F";
		str[1][2] = "G";
		str[1][3] = "H";
		
		str[2][0] = "I";
		str[2][1] = "J";
		str[2][2] = "K";
		str[2][3] = "L";
		
		int row = str.length;
		int col = str[0].length;
		
		for(int x=0;x<row;x++)
		{
			for(int y=0;y<col;y++)
			{
				System.out.print(str[x][y]);
			}
			System.out.println();
		}
		
		//Object array
		System.out.println("Object array:");
		
		Object test[] = new Object[5];
		
		test[0] = 100;
		test[1] = "Hello";
		test[2] = true;
		test[3] = 3.14283512;
		test[4] = 'A';
		
		for(int cnt=0;cnt<5;cnt++)
		{
			System.out.println(test[cnt]);
		}
		
		
		
		
		
		
		
		
		
	}

}
