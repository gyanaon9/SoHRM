package Javapro;

public class BabuleshotMaxi {



		public static void main(String[] args)
		{
			int a[]={5,3,-8,10};
			for(int i=1;i<=a.length-1;i++)
			{
				for(int j=0;j<a.length-1-i;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			for(int k=0;k<=a.length-1;k++)
			{
				System.out.println(a[k]);
			}
			int x=a[a.length-1];
			int y=a[a.length-2];
			int z=x*y;
			System.out.println(z);

		}


}

