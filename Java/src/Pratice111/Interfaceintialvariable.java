package Pratice111;

interface x{
	
	public default void  m()
	{	
		  int a=90;
		System.out.println("GRS= "+a);
}
}

public class Interfaceintialvariable  implements x{
	
	public static void main(String[] args) {
		
	
		
		Interfaceintialvariable  ob=new Interfaceintialvariable();
		ob.m();
		System.out.println("XXX");
	}
}
