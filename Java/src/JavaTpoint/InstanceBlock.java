package JavaTpoint;

public class InstanceBlock {


	InstanceBlock(){  
		System.out.println("parent class constructor invoked_1");  
	}  
}  

class B extends InstanceBlock{

	B(){  
		super();  
		System.out.println("child class constructor invoked_2");  
	}  

	B(int a){  
		super();  
		System.out.println("child class constructor invoked_3 "+a);  
	}  

	{System.out.println("instance initializer block is invoked_4");}  

}