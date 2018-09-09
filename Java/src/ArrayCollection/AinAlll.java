package ArrayCollection;
import java.util.ArrayList;

public class AinAlll {

		public static void main(String[] args) {
			
			ArrayList<Character>a=new ArrayList<Character>();
			a.add('@');
			a.add('&');
			a.add('%');
			System.out.println(a);
			//for(char ch:a)
			for(int ch=0;ch<a.size();ch++)
			{
				System.out.println(a.get(ch));
			}

		}

	


}
