package ZPratice;
public class Encap 
{
	private static int a=80;
	private static char ch='%';
	public static int getA()
	{
		System.out.println("@@++++++++@@@@");
		return a;
	}
	public static char getCh() {
		return ch;
	}
}
class w extends Encap
{
	public void H()
	{
		System.out.println("@@@@@");
		}
}
