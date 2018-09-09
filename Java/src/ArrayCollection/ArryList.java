package ArrayCollection;

import java.util.ArrayList;

public class ArryList {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("GRS");
		a.add('&');
		a.add(100);
		System.out.println(a);
		 
		//for(int i=0;i<=2;i++)
		for( Object ob:a)
		{
			//System.out.println(a.get(i));
			System.out.println(ob);
	
		}
	}

}
