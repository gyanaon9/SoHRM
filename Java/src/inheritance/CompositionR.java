package inheritance;

public class CompositionR {

	public static void main(String[] args)
	{
		//Object for B
		B f=new B();
		//calling the Method
		System.out.println("ch="+f.ch);
		System.out.println("a="+B.a);
		System.out.println("x="+f.d.x);

	}




}

