package Loop;

import java.util.HashSet;
import java.util.Set;

public class Dulicate {

	public static void main(String[] args) {

		String names[] = { "java", "javas", "c++", "java", "GRS", "GRS" };

		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=i+1;j<=names.length-1;j++)
			{
				if(names[i]==names[j])
				{
					System.out.println("Duplicate is="+names[j]);
				}
				
			}
			
		}
		
	}

}
