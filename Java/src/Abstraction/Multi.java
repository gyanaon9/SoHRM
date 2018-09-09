package Abstraction;

abstract class Multi {

	

		//public void m(){}

		abstract public  void b1();
		abstract public void b2();
		abstract public void b3();
	}
	abstract class H extends Multi
	{
		public void b1()
		{
			int a=0;
			System.out.println("Run111="+a);
		}

		public void b2()
		{
			System.out.println("Run222");

		}
	}
		class S extends H
		{
			public void b3()
			{
				System.out.println("Run333");
			}

	}

