package Z;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter.....");
		int no=sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("NoT");
		}

	}
}





