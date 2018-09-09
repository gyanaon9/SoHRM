package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String ob="Gyana ranjan Sahoo";
		System.out.println(ob);
		System.out.println("___________________");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter...");
		String ab =sc.nextLine();

		// int count=0;
		for(int i=ab.length()-1;i>=0;i--)
		{
			System.out.print(ab.charAt(i));
			
		}



	}
}

