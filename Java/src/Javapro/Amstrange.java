package Javapro;
	 public class Amstrange {
	 	
	 		public static void main(String[] args)
	 		{
	 		//Armstrong=number3=(1+125+27);  
	 		    int n=153;
	 		    int temp=n;
	 		    int sum=0;
	 		    while(n>0)
	 		    {
	 		    	int r=n%10;
	 		    	System.out.println("r="+r);
	 		    	sum=sum+(r*r*r);
	 		    	System.out.println(sum);
	 		    	n=n/10;
	 		    	System.out.println(n);
	 		    }
	 			if(sum==temp)
	 			{
	 				System.out.println("amstrong");
	 			}
	 		    else
	 			{
	 				System.out.println("NOT");
	 			}       
	 			
	 		}

	 	}


