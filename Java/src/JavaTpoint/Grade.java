package JavaTpoint;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter....................................................");
		int no=sc.nextInt();
		if(no<40)
		{
			System.out.println("Fail");
		}
		else if(no>=40 && no<50)
		{
			System.out.println("D");
		}
		else if(no>=50 && no<60)
	{
		System.out.println("C");
	}
		else if(no>=60 && no<80)
	{
		
		System.out.println("B");
	}
		else if(no>=80 && no<90)
{
		System.out.println("A");}
		else if(no>=90 && no<100)
	{
		System.out.println("A+");
	}
}
}
