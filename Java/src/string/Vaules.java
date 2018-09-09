package string;

public class Vaules {

	public static void main(String[] args)
	{
		String k="GYANA RANJAN SAHOO";
		char a[]=k.toCharArray();
		System.out.println(a);
		System.out.println(k);
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
