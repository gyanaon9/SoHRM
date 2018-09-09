package JavaTpoint;
import java.util.Scanner;

public class IfSal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter.....");
		int sal=sc.nextInt();
		
		//if(sal>=1000 && sal<=1000)____Particular Value
		if(sal>=1000 && sal<=10000)
			
		{
			System.out.println("MOTO");
		}
		else if(sal>10000 && sal<100000)
		{
			System.out.println("Samsung");
		}
		else if(sal>=100000  )
		{
			System.out.println("Apple");
		}
		else 
		{
			System.out.println("invalid");
		}
	}

}
