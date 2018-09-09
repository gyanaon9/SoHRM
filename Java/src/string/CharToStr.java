package string;

public class CharToStr {

	public static void main(String[] args)
	{
		char[]a={'a','b','c','d'};
		String ob="";
		for(int i=0;i<a.length;i++)
		{
			  ob=ob+a[i];
			 // String x=ob+a[i];
			  //System.out.print(x);
		}

		 System.out.print(ob);
	}

}
