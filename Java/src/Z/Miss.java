package Z;

public class Miss {
	
	public static void main(String[] args) {
		
		int sum=0;
		int a[]={1,2,3,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	
	int sum1=0;
	for(int i=0;i<8;i++)
	{
		sum1=sum1+i;
		
	}
	System.out.println(sum1);
	System.out.println("Missing NO="+(sum1-sum));
}
}
