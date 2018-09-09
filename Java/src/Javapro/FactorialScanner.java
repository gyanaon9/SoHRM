package Javapro;

import java.util.Scanner;

public class FactorialScanner {



			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a no.");
			int number=sc.nextInt();
			int fact=1;
			for(int i=1;i<=number;i++)
			{
				  fact=fact*i;
			}
			
				System.out.println("Factorial of a no.="+fact);
				
			}

		}


