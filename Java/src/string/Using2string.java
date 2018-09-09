package string;

import java.util.Scanner;

public class Using2string {
	
	
	public static void main(String[] args) {
		//String word;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter");
	   String	word = s.nextLine();
		
		
		if (word.equalsIgnoreCase("GRS")) {
			System.out.println("This is your name");
		} else if (word.equalsIgnoreCase("Jspur")) {
			System.out.println("Odisha's best place");
		} else {
			System.out.println("you Have entered invalid input");
		}
	}

}
