package inheritance;

public class Inherit {

	
		//for nonstatic i=10 case
			 int i = 10;
			public void  m()
			{

				System.out.println("Alok");

			}
		}
		class H extends Inherit
		{
			int i = 20;
			public void  m()
			{
				int i=90;
				System.out.println("GRS");
				System.out.println(i);
			}



	}
