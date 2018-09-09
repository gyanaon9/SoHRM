package ArrayCollection;

	import java.util.HashSet;

	public class Hashset {

		public static void main(String[] args) 
		{
			HashSet hs=new HashSet();
			hs.add(1900);
			hs.add(900);
			hs.add(999);
			hs.add(666);
			hs.add("j");
			hs.add("j");//Duplicate are not allowed.
			System.out.println(hs);
			hs.remove(100);
			System.out.println(hs);
			System.out.println(hs.size());
			System.out.println(hs.contains(999));

		}

	


}
