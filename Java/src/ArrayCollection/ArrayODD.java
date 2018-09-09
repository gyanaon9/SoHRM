package ArrayCollection;

public class ArrayODD {
	
		public static void main(String[] args)
		{
			
			int p[]={1,2,3,4,5,6,7,8,9,10};
			for(int i=0;i<10;i++)
			{	
				if(i%2==0)
				{
					System.out.println("ODD="+p[i]);
					//System.out.println("By index value");
					//System.out.println(p[i]);
				}
				else
				{
					System.out.println(p[i]);
				}
		}
		
	}

}
