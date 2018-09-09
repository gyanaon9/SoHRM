package Javapro;

import java.util.Scanner;

public class Pallidram {


		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a no");
			int n = s.nextInt();
			int rev = 0, r;
			int temp = n;
			while (n > 0) {
				r = n % 10;
				System.out.println("r=" + r);
				rev = rev * 10 + r;
				System.out.println("rev=" + rev);
				n = n / 10;
				System.out.println("number=" + n);
			}
			if (rev == temp) {
				System.out.println("pallindrome");
			} else {
				System.out.println("not pallindrome");
			}
		}

	}
