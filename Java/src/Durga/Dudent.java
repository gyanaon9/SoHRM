package Durga;

public class Dudent {
	
	String name;
	int rollno;
	Dudent(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		System.out.println(name+"  "+rollno);
	}
	public static void main(String[] args) {
		
		Dudent d=new Dudent("GRS",1);
		
		//d.print();
		
	}

}
