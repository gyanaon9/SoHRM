package ArrayCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashseto {

	public static void main(String[] args) {
		
		Set<String>a=new HashSet<>();
		a.add("ASA");
		a.add("XXX");
		a.add("00");
		a.add("SSS");
		a.add("PPp");
		System.out.println(a);
		
		   ArrayList<String>x=new ArrayList<>(a);
			System.out.println(x);
			System.out.println(x.get(3));
}


	}


