package ArrayCollection;

public class ArrayRevMet {

	public static void main(String[] args) {
		int p[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<5;i++)
		{
			System.out.print(p[i]+"\t");
		}
		for(int j=9;j>=5;j--)
		{
			System.out.print(p[j]+"\t");
		}
	}
}