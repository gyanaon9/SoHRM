package Z;

public class TryCfive {

	public static void main(String[] args) throws Exception {
		try {
			int a=10/0;
			System.out.println("Error...'");
			if(false)
				throw new Exception ("Error2");
		}
		catch(Exception e) {
			System.out.println("Handle........");
		}
		finally {
			System.out.println("Always");
		}

	}

}
