package Moverridding;

public class Mukesh {

	public static void main(String[] args) {
		Mukesh ob=new Mukesh();
		ob.add(20, 30);
		ob.add(30, 40, 60);
	}
	
	public void add(int a, int b){
		
		int c=a+b;
		System.out.println("Sum of number="+c);
	}
	public void add(int a,int b,int d){
		
		int c=a+b+d;
		System.out.println("sum of no="+c);
		
	}
	

}
