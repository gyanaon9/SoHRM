package Javapro;

import java.util.Scanner;

public class Pallindram 

	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a n0");
			int no=sc.nextInt();
			int copy=no;
			int riv=0;
			while(no>0)
			{
				int rem=no%10;
				riv=riv*10+rem;
				no=no/10;
			}
				if(copy==riv)
				{
					System.out.println("palindrom");
				}
				else
				{
					System.out.println("Not palindrom");
				}
			}
		}

