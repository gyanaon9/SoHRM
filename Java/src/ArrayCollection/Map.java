package ArrayCollection;

import java.util.HashMap;

public class Map {

	
	public static void main(String[] args) {
		HashMap<Integer,String>h=new HashMap<Integer,String>();
		h.put(1000, "grs");
		h.put(1001, "abhi");
		h.put(1000, "abhi");
		h.put(112, "dod");
		h.put(1000,"raj");
		h.put(10, "XXX");
		System.out.println(h);
		
	}
}
