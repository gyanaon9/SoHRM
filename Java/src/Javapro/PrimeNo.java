package Javapro;
import java.util.Scanner;

public class PrimeNo {

			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter no.");
				int number=sc.nextInt();
				int count=0;
				for(int i=1;i<=number;i++)
				{
					if(number%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("prime");
				}
				else
				{
					System.out.println("not prime");
				}
			}

		}
