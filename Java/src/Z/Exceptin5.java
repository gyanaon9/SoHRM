package Z;

public class Exceptin5 {

public static void main(String[] args) {
	
try{
	E d=new E();
	d.methoid();
}catch(Exception e) {System.out.println("Exception handled");
}finally{  System.out.println("Always Excuted");
}
}
}