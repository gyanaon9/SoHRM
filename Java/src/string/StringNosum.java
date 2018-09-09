package string;

import java.util.Scanner;

public class StringNosum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter No");
		String word=sc.nextLine();
		int count=0;
		for(int i=0;i<=word.length()-1;i++)
		{
			if(word.charAt(i)>='0' && word.charAt(i)<='9')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
