package ArrayCollection;

import java.util.LinkedList;

public class LInklist {

	public static void main(String[] args) 
	{
       LinkedList<Integer>a=new LinkedList<Integer>();
       a.add(10);
       a.add(20);
       a.add(30);
       a.add(80);
      // a.addFirst(500);
       //a.addLast(50000);
       a.add(100);
       System.out.println(a);
	   a.removeFirst();
	   System.out.println(a);

	}


}
