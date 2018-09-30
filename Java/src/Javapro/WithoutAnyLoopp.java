package Javapro;

public class WithoutAnyLoopp {

	int x = 1;

	public void m() {

		System.out.print(x + "\t");
		x++;
		if (x < 15)
			m();
	}

	public static void main(String[] args) {
		WithoutAnyLoopp d = new WithoutAnyLoopp();
		d.m();
	}
	// single_line____new Ex().m();
}