package Abstraction;

interface Interx {

	
		abstract public void b1();
		         public void b2();
		                void b3();
		                final int a=90;
	}
	class L implements Interx
	{
		public void b1()
		{
			System.out.println("RRRRRRRRRR");
			}
			public void b2()
			{
				System.out.println("RRROOOORR");
			}
			public  void b3()
			{
				System.out.println("Variable="+a);
				System.out.println("R3333333RR");
			}

}