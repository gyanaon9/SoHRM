package inheritance;

public class Composition {

	
		int x=30;
		public  void p1()
		{
			System.out.println("1111111111");
		}
	    public void p2()
	    {
	    	System.out.println("2222");
	    }
	}
	class B
	{
		char ch='@';
		static char a='&';
		 Composition d=new Composition();
	}
