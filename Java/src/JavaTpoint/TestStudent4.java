package JavaTpoint;
class Student{  
	
int rollno;
String name;
public void intialize(int r, String n){
	rollno=r;
	name=n;
}
public void display(){

	System.out.println(rollno+"____________________"+name);
}
}
class TestStudent4{
	
	public static void main(String[] args) {
		
		Student d1=new Student();
		Student d2=new Student();
		d1.intialize(1, "GRS");
		d2.intialize(2, "JSPUR");
		d1.display();
		d2.display();
	}
}
		
