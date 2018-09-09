package ArrayCollection;


	

import java.util.HashMap;

public class Hashmap {
	
	
	public static void main(String[] args) {
		
	HashMap<Integer,String>h=new HashMap<Integer,String>();
	h.put(1000, "grs");
	h.put(1001, "abhi");
	h.put(1000, "abhi");
	h.put(112, "dod");
	System.out.println(h);
	h.remove(1000);
	System.out.println(h);
	System.out.println(h.containsKey(112));
	System.out.println(h.containsValue("grs"));
	
	System.out.println(h.size());
	

	}

}



