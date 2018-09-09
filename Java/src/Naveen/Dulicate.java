package Naveen;

import java.util.HashSet;
import java.util.Set;

public class Dulicate {

	public static void main(String[] args) {

		String names[] = { "java", "javas", "c++", "Java", "GRS", "GRS" };

		Set store = new HashSet();

		for (String name : names) {
			if (store.add(name) == false)

				System.out.println("DUPLICATE element=" + name);
		}

	}

}
