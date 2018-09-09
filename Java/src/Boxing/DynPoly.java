package Boxing;

 interface DynPoly
{
	
	void b2();
	void b3();
	abstract void b1();
}
 class H implements DynPoly
{
	public  void b1()
	{
		System.out.println("121");
	}
	public void b2()
	{
		System.out.println("131");
	}
	
	public void b3()
	{
		System.out.println("555");
	}
	
	
	
	

}
