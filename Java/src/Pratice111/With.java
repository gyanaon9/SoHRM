package Pratice111;

import Javapro.WithoutAnyLoopp;
import Pratice111.AAAA;

public class With {
	
	int x=1;		
	public void m1()
	{
		//if(x<=15)
		{
			//if(x%2==1)
	 System.out.print(x+",");
		x++;
		if(x<=15)
		m1();
		}
	}
		public static void main(String[] args)
		{		
			With d=new With();

			d.m1();



 }
}