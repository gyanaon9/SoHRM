package Javapro;

public class PrimeNoFrom {

	

		public static void main(String[] args)
		{
			for(int i=2;i<=100;i++)
			{
			
			for(int j=2;j<=100;j++)
			{
				if(i==j)
				{
					System.out.print(" "+j);
				}
				if(i%j==0)
				{
					break;
				}
				}
			}
		}
	}

