package Javapro;

public class Duplicateee {

	public static void main(String[] args) {
		String []s = { "grs", "Rasmi", "Souvik", "Souvik", "grs" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					System.out.println("Duplicate is " + s[j]);
				}
			}
		}

	}

}
