package JavaTpointE;


enum Weer{
	A,B,C,D;
}

public class Test2 {
	
	public static void main(String[] args) {
		Weer[] b=Weer.values();
		for(Weer b1:b)
			System.out.println(b1+"_______"+b1.ordinal());
	}

}
