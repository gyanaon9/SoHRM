package ZPratice;

public interface Demo
{
	void a1();
	public void a2();
	abstract public void a3();
}
class Remo implements Demo
{
	public void a1()
	{
		System.out.println("a1 in process");
	}
	public void a2()
	{
   System.out.println("a2 in process");
	}
	public void a3()
	{
   System.out.println("a3 in process");
	}
}
	