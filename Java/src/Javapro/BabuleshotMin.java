package Javapro;

public class BabuleshotMin {

		public static void main(String[] args)
		{
			int a[]={2,3,-4,6};
			for(int i=1;i<=a.length-1;i++)
			{
				for(int j=0;j<=a.length-1-i;j++)
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
			int x=a[0];
			int y=a[1];
			int z=x*y;
			System.out.println(z);
			

		}
}
