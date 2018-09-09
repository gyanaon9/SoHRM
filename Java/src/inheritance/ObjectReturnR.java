package inheritance;

public class ObjectReturnR {

	public static void main(String[] args) 
	{
		
		int Z=ObjectReturn.b2();
		System.out.println("Z="+Z);
		  D k=new D();
//calling global "a" value
		  ObjectReturn o=new ObjectReturn();
			System.out.println("X="+o.a);
// "a" value calling end
		    System.out.println("kl="+k.b3());
	}
}
