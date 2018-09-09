package ArrayCollection;



import java.util.ArrayList;

public class ArrrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(3);
		a.add(56);
		a.add(2,100);
		System.out.println(a.size());
		System.out.println(a);
		a.set(2,1111111111);
		System.out.println(a);
		System.out.println(a.contains(10));
	}
}



