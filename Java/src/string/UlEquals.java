package string;

public class UlEquals {

	public static void main(String[] args) {
		String str="good mrng";
		String s="GOOD MRNG";
		if(str.equalsIgnoreCase(s))
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Diff");

	}

}
