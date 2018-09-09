package Starr;

import java.util.Scanner;

public class Star8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int rows = sc.nextInt();
		for(int i=0;i<=rows;i++)
		{	
			System.out.print(i+"  ");
		}
		System.out.println();

	}
}
