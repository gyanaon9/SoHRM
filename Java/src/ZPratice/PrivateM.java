package ZPratice;

public class PrivateM 
{
		private char c='@';
		 static int a=10;
		private  void a1()
		{
			System.out.println("a1 in process");
		}
		public void a2()
		{
			System.out.println("a2 in process");
		}
		public static  void a3()
		{
			System.out.println("a3 in process");
		}

		public static void main(String[] args)
		{
			PrivateM  d=new PrivateM();
			  System.out.println("c="+d.c);
		 //call static member by classname or ref value of object
			System.out.println("a="+PrivateM.a);
			d.a1();
			d.a2();
			PrivateM .a3();
		 
		}

	}


	



