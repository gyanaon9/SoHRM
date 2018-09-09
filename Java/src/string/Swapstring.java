package string;

public class Swapstring {


	public static void main(String[] args) {
		
		String a="GRS";
		String b="XXX";
		//append a & b
		a=a+b;
		//stroe initial string a in b
		b=a.substring(0, a.length()-b.length());
		//3.store inital string b  in a
		a=a.substring(b.length());
	    System.out.println("After swaping="+a);
	    System.out.println("After swaping="+b);
	}

}