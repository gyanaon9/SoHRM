package Practice112;

public class TryC {
	
	public static void main(String[] args) {
		try {
			int a=10/0;
			
			System.out.println(a);
		}
	
	catch(Exception e) {
		
		System.out.println("handle.......");
//printStackTrace() helps the programmer to understand where the actual problem occurred.
		e.printStackTrace();
	}
	}
	

}
