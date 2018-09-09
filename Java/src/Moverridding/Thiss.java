package Moverridding;

public class Thiss {


	Thiss()
	{
		System.out.println("Run in class 1");
	}
	Thiss(int x)
	{
	  this(23.5);
		System.out.println("Run in class 2");
		
	}
	Thiss(double y)
	{
		this();
		System.out.println("Run in class 3");
	}

}
