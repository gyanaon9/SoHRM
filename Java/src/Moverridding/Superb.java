package Moverridding;

public class Superb {

	
		//super(int x);
		Superb()
		{
			System.out.println("Run1111");
		}
	}
	class B extends Superb
	{
		B()
		{
			//super(9);
			//super();
			System.out.println("Run2222");
		}
	}
	class C extends B
	{
		C()
		{
			super();
			System.out.println("r3");
		}
	}



