package Loop;

public class Loop1 {


	
		public static void main(String[] args) {
		
			for(int I= 0;I<=5;I++){
				System.out.println("Count is  ==> " + I );
			}

			System.out.println("        <==== Next Count ====>");
		
			for(int D= 5;D>=0;D--){
				System.out.println("      Count is ==> " + D );
			}

			System.out.println("<==== Next Count ====>");
			
			
			
			for(int I= 0;I<=5;I+=2){
				System.out.println("Skip every one another  ==> " + I );
			}
		}
	}