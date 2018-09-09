package ZPratice;

public class DynPolymer {

	public void eat()
	{
		System.out.println("GRS1");
	}
	public void eat1()
	{
		System.out.println("GRS2");
	}
}
	class Ad extends DynPolymer
	{
		public void eat()
		{
			System.out.println("GRS3");
		}
		public void eat1()
		{
			System.out.println("GRS4");
		}
		public void eat2()
		{
			System.out.println("GRS45");
		}
	

	}
	

