package Moverridding;

public class VanuR extends Vanu {
	
//Return_Type always take similar according to the Parent_class
	public void m(int a,double b){
		System.out.println("Child");
	}
		
        public static  void main(String[]args) {
        	VanuR d=new VanuR();
        	d.m(10, 20);
		
	}

}
