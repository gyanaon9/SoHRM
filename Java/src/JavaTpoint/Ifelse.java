package JavaTpoint;

import java.util.Scanner;

public class Ifelse {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int no=sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}

}
