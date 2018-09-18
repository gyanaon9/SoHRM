package Loop;

public class Loop2 {

	
		public static void main(String[] args) {

			for(int Count = 0;Count<=5;Count++){			
				if(Count==3){
					continue;				
					}
				System.out.println("Count is ==> " + Count);
				}

	
			System.out.println("<==== Next Count ====>");
			for(int Count = 0;Count<=5;Count++){
				if(Count==3){
					System.out.println("Count is ==> " + Count);
					continue;				
					}
				}
			}
		}
