
public class Analyzer
	{
	
	public static void main(String[] args)
		{
		printNumberofRecords();
		findqs();
		findNumberOfgs();
		findNumberOf6();
		}

	public static void printNumberofRecords()
		{
		Data.addData();
		System.out.println("There are " + Data.data.size() + " records in the data base.");
		}
	
		public static void findqs()
			{
			int counterTotalqs = 0;
			for (int i=0; i<Data.data.size(); i++)
				{
				if (Data.data.get(i).getletterCode().contains("qqq"))
					{
					counterTotalqs = counterTotalqs +1;
					}
				}
			System.out.println("There are " + counterTotalqs + " occurrences of \"qqq\" in the Data.");
			}
		public static void findNumberOfgs()
			{
			double counterTotalNumberOfgs = 0;
					
			for (int i =0; i<Data.data.size(); i++)
				{
				if(Data.data.get(i).getletterCode().substring(0,1).equals("g"))
					{
					counterTotalNumberOfgs = counterTotalNumberOfgs + 1;
					}
				}
			System.out.println("There are " + counterTotalNumberOfgs + " records beginning with the letter\"g\".");
			System.out.println("That is " + (counterTotalNumberOfgs/Data.data.size()* 100) + " % of the records");
			}
		
		public static void findNumberOf6()
			{
			int counterTotal6Characters =0;
			
			for (int i =0; i<Data.data.size(); i++)
				{
				if(Data.data.get(i).getletterCode().length() ==6)
					{
					counterTotal6Characters = counterTotal6Characters + 1;
					}
				}
			System.out.println("There are " + counterTotal6Characters + " letter codes that are exactly six characters in length");
			}		
		public static void findFields()
			{
			int counterTotalNumberOf7s =0; 
			int counterTotalNumberof1s =0;
			
			for (int i=0; i<Data.data.size(); i ++)
				{
				if(Data.data.get(i).getletterCode().substring(0,1))
					{
					counterTotalNumberOf7s = counterTotalNumberOf7s +1;
					}
				}
			}
		}
