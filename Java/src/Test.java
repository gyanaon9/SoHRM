import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		String s = "abcdefg";
		char[] a = s.toCharArray();
		Map<Character, Boolean> isswaped = new HashMap<Character, Boolean>();

		for (int i = 0; i < a.length; i++) {
			isswaped.put(a[i], false);
		}
		// System.out.println(isswaped);
		// isswaped.put(key, value)
		for (int i = 3; i < s.length(); i++) {
			if (i % 2 != 0 && !isswaped.get(a[i]) && !isswaped.get(a[i - 2])) {
				char temp;
				isswaped.replace(a[i], true);
				isswaped.replace(a[i - 2], true);
				temp = a[i - 2];
				a[i - 2] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(isswaped);
		System.out.println(new String(a));
	}
}
