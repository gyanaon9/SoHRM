package Abstraction;

abstract class Multiple {
	
		abstract public void b1();
		abstract public void b2();
		abstract public void b3();
	
		}
	 class V extends Multiple
	{
		public void b1()
		{
			System.out.println("Run111");
		}
		
		public void b2()
		{
			System.out.println("Run222");
		}
		public void b3()
		{
			System.out.println("Run333");
		}

	
}

