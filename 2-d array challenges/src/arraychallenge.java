
public class arraychallenge
	{

	public static void main(String[] args)
		{
		printArray();
		printMustang();
		printNumbers();
		}
	public static void printArray ()
		
	{
	int myArray [][] = {{2,4,6,8},{3,6,9,12},{4,8,12,16}};
	System.out.println(myArray[1][2]);
	}

	public static void printMustang()
	{
	
	String mustangArray [][] = new String [5][3]; 
	for (int row =0; row <5; row ++)
		{
		for (int column =0; column <3; column ++)
			{
			mustangArray [row][column] = "Mustang  ";
			}
		}
	for (int row = 0; row <5; row ++)
		{
		for (int column =0; column <3; column ++)
			{
			System.out.print(mustangArray[row][column]);
			}
		System.out.println("");
		}
	}
	
	public static void printNumbers()
		{
		int counter = 10;
		int numberArray[][] = new int [3][3];
		
		for (int row =0; row <3; row ++)
			{
			for (int column =0; column <3; column ++)
				{
				numberArray [row][column] = counter;
				counter = counter + 10;
				}
			}
		for (int row =0; row <3; row ++)
			{
			for (int column =0; column <3; column ++)
				{
				System.out.print(numberArray[row][column]);
				System.out.print("  ");
				}
			System.out.println("");
			}
		int  totalCorner;
		totalCorner = numberArray[0][0] + numberArray[2][0] + numberArray[0][2] + numberArray[2][2];
		System.out.println("The numbers of the corners added up are " + totalCorner);
		}
	
	}
