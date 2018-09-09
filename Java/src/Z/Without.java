package Z;

public class Without {
	
int x=1;
public void m()
{
	System.out.print(x+"\t");
             x++;
             if(x<15)
             m();
}
public static void main(String[] args) {
	
	Without d=new Without();
	    d.m();
}
}