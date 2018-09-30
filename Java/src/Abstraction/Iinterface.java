package Abstraction;

interface Iinterface {
	

      
		public void b1();
		void b2();
		int a=10;
		
	}
	interface R extends Iinterface
	{
		void b3();
	}
		class Y implements R 
	{
		public  void b1()
		{
			System.out.println("RRRRRRRRRRr");
		}
		public  void b2()
		{
			System.out.println("RXXXXXXXXXXX");
		}
		
		public   void b3()
		{
			System.out.println("RZZZZZZZZ");

}

}

