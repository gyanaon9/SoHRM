package Javapro;

public class FibonacLoop {


		
			public static void main(String[] args) {
				
		     int a=0;
		     int b=1;
		     System.out.println(a);
		     System.out.println(b);
		     int c=a+b;
		     System.out.print(c+"\t");
		     while(c<21)
		     {
		    	 a=b;
		    	 b=c;
		    	 c=a+b;
		         System.out.print(c+"\t");
			}

		}
		}
