package JavaTpointE;

public class Tryc {

	
		  public static void main(String args[]){  
		   try
		   {  
		      int data=50/0;     
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e); //Show Error name
		   }  
		   System.out.println("rest of the code...");  
		} 
}