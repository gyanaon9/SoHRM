package JavaTpoint;

public class AccountR {

	public static void main(String[] args) {
	
		
		Account d=new Account();
		d.insert(11111111, "...GRS at jspur...", 10000);
		d.dispay();
		d.checkBalance();
		d.deposite(1000);
		d.checkBalance();
		d.withD(500);
		d.checkBalance();

	}

}
