package JavaTpointE;

enum Deer{
	AB,CD,EF,GH
}

public class Test {

	public static void main(String[] args) {
		
		Deer d=Deer.AB;
		switch(d){
		       case AB:
		    	   System.out.println("my name grs");
		  break;
		       case CD:
		    	   System.out.println("my hometown place");
          break;
		       case EF:
		    	   System.out.println("JSpUR");
		  break;
		       case GH:
		    	   System.out.println("916 DURGA");
		  break;
		       default:
		    	   System.out.println("NAM MYOHO RENGE KYO");
		    	   
	}
	}
}
