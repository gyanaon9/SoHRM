package ZPratice;

public class ProtectedM 
{
	protected char ch='@';
	protected static char c='&';
    protected void a1()
  {
  System.out.println("a1 in process");
  }
   protected static void a2()
   {
  System.out.println("a2 in process");
   }
}

   class t extends ProtectedM
//extends means we can call parent class member throw child class object
   {
	   public static  void a3()
	   {
		   System.out.println("SSSSSSSSSSSSSSS");
	   }
   }
