package Javapro;

import java.util.Scanner;

public class RemoveChar {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter....");
		String s=sc.nextLine();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>96 && s.charAt(i)<122)
			{
				System.out.print(s.charAt(i)+" ");
			}
			if(s.charAt(i)>64 && s.charAt(i)<91)
			{
		System.out.print(s.charAt(i)+ "  ");
	}

}
}
}