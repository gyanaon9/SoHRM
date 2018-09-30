package Practice112;

public class Recration {

	static int x = 1;

	public void m() {
		
		 System.out.println(x);
		x++;
		if (x < 5) {
			m();
		}

	}

	public static void main(String[] args) {
		Recration d = new Recration();
		d.m();
	

	}
}

