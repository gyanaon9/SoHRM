package Javapro;

public class WithoutAnyLoopp {

	int x=1;		
	public void m()
	{
		if(x<=15)
		{
			
	 System.out.print(x+",");
	            x++;
	            m();
		
		}
	}
		public static void main(String[] args)
		{		
			WithoutAnyLoopp d=new WithoutAnyLoopp();

		    	d.m();



			//single_line____new Ex().m1();
		}		

}