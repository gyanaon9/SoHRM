package ArrayCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.Inflater;

public class HashiteratoR {
	
	
	public static void main(String[] args)
	{
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(210);
		hs.add(222);
		hs.add(333);
		hs.add(444);
		hs.add(555);
		System.out.println(hs);
	Iterator<Integer>it=hs.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.hasNext());
	}
}


