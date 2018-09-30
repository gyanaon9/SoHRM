package Practice112;

public class FiveKey {

public static void main(String[] args) throws Exception {
	try {
		int a=10;
		System.out.println(a);
		if(false)
		throw	new Exception ("Error");
	}
	catch(Exception e) {
	System.out.println("handle");
	}
	finally{
		System.out.println("Always");
		
	}
}
	
}
