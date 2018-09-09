package string;

public class SBinsert 
{
	public static void main(String[] args)
	{	
      StringBuffer d=new StringBuffer("GRS JSPUR");
      d.insert(4,"at");
      System.out.println(d);
      d.deleteCharAt(4);
      System.out.println(d);
      d.replace(0,3, "LOW");
      System.out.println(d);
      //substring
    String s=d.substring(5);
      System.out.println(s);
    //output string
    StringBuffer sb=new StringBuffer("GRS DDDD");
    String sf=sb.substring(0,3);
    System.out.println(sf);
    //String Reverse
    StringBuffer sg=new StringBuffer("GRS at jspur");
    System.out.println(sg);
    System.out.println("Reverse="+sg.reverse());      
	}

}
