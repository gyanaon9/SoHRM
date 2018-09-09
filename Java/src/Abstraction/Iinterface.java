package Abstraction;

interface Iinterface {
	

		//In interface we can initialize static method as a Complete  mmethod
		public static void m(){
			System.out.println("hello from static");
		}
		//In interface we can initialize Default method as a Complete method 
		public default void U(){

			System.out.println("Hello GRS.....");
		}
		public void b1();
		void b2();
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

