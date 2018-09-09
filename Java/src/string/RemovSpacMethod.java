package string;

public class RemovSpacMethod {

	public static void main(String[] args) 
	{
		String str="My name is GRS";
		String strw=str.replaceAll("\\s", "");
		System.out.println(strw);

	}

}
