package ArrayCollection;
	
	
	import java.util.Iterator;
	import java.util.TreeSet;

	public class TreeSett {
		
		public static void main(String[] args)
		{
			TreeSet<Integer>a=new TreeSet<Integer>();
			a.add(510);
			a.add(20);
			a.add(30);
			a.add(40);
			System.out.println(a);

			Iterator<Integer>b=a.iterator();
			while(b.hasNext())
			{
				System.out.println(b.next());
			}
		}
}
