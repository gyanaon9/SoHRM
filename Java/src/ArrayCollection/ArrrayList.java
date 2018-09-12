package ArrayCollection;



import java.util.ArrayList;
import java.util.ListIterator;

public class ArrrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(3);
		a.add(56);
		a.add(2,100);
		System.out.println(a.size());
		ListIterator<Integer>a1=a.listIterator();
		System.out.println("Element in forword direction.....");
		while( a1.hasNext())
		{
	System.out.print(a1.next()+"\t");
	
		}
		System.out.println("Element in Reverse direction......");
		while(a1.hasPrevious())
		{
			System.out.print(a1.previous()+"\t");
		}
		
	}
}



