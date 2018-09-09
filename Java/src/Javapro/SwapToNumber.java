package Javapro;

public class SwapToNumber {

	
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		//Using 3rd party
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println(x);
		System.out.println(y);
		//without 3rd party
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		System.out.println("____"+x);
		System.out.println(y);
	}

}