package ZPratice;

public class Unboxing {

	public static void main(String[] args)
	{
		Integer i=new Integer(80);
	
		int a=(int)i;//unboxing
		
		System.out.println("a="+a);
		
		Character cha=new  Character('&');
		char ch=(char)cha;
		System.out.println("ch="+ch);
		

	}

}
