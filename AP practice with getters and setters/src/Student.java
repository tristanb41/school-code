import java.util.ArrayList;
import java.util.Scanner;

public class Student
	{
	private String name;
	private int score;
	static ArrayList <Student> results = new ArrayList<Student>();
	public Student(String n, int s)
		{
		name = n;
		score = s;
		}
	public String getName()
		{
		return name;
		}
	
	public void setName(String name)
		{
		this.name = name;
		}
	
	public int getScore()
		{
		return score;
		}
	
	public void setScore(int score)
		{
		this.score = score;
		}
	
	public static void main(String[] args)
		{
		 results.add(new Student("Edwin", 66));
		 results.add(new Student("Timothy", 41));
		 results.add(new Student("Aaron", 14));
		 results.add(new Student("Steve", 99));
		 results.add(new Student("Ryan", 100));
		 
		 printScores();
		 addStudent();
		 printScores();
		 adjustScores();
		 printScores();
		}
	
	public static void printScores(){
	for (Student i :results)
		 {
		 System.out.println(i.getName() +"'s" + " score is " + i.getScore());
		 }
	}
		public static void addStudent()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the new Student's name?");
		String newName = userInput.nextLine();
		System.out.println("What is the new Student's score?");
		int newScore = userInput.nextInt();
		results.add(new Student(newName, newScore));
		}
		
		public static void adjustScores()
			{
			for (int i =0; i <results.size(); i++)
				{
				if (results.get(i).getScore() < 50)
					{
					results.get(i).setScore(55);
					}
				}
			}
	}
