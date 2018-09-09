
public class ThrowThrows {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		try {
			int a = 10 / 5;
			System.out.println(a);
			if (false)
				throw new Exception("Hello World");
		} catch (Exception e) {
			System.out.println("Hey");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
