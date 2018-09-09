package inheritance;

public class InheritR {


	public static void main(String[] args) {

		//// Inertic d=new H();
		H d = new H();
		System.out.println(d.i);
		d.m();

		// for nonstatic i=10 case
		Inherit o = new Inherit();
		System.out.println(o.i);

	}
}

