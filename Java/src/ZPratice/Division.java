package ZPratice;

import java.util.Scanner;

public class Division
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int number=sc.nextInt();
		
		if(number%5==0)
		{
			System.out.println("div");
		}
		else
		{
			System.out.println("Not");
		}
	
		
	}
}


