package Pratice111;

import java.util.Scanner;

public class Vote18 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter..");
		int no=sc.nextInt();
		
		if(no>=18)
		{
			System.out.println("Eligable for Vote");
		}
		else
		{
			System.out.println("Not");
	}

}
}
