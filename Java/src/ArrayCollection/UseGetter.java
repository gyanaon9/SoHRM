package ArrayCollection;

import java.util.ArrayList;

public class UseGetter {
	

	public static void main(String[] args)
	{
		ArrayList<Character>c=new ArrayList<Character>();
		c.add('@');
		c.add('C');
		c.add('&');
		c.add('=');
		c.add('#');
		System.out.println(c);
		
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		
		
		
	}
}