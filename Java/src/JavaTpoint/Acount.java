package JavaTpoint;

      class Account {
	int acc_no;
	String name;
	float amount;
	public void insert(int a,String n,float amt){
		acc_no=a;
		name=n;
		amount=amt;
	}
	public void deposite(float amt){
		amount=amount+amt;
		System.out.println("amount="+amt);
	}
	public void withD(int amt){
		if(amount<amt)
			System.out.println("insufficent");
		
		else
		
			amount=amount-amt;
			System.out.println(amt+" withdrow");
		}
	
		public  void checkBalance(){
			System.out.println(amount+"=Check balance");
		}
		public void dispay(){
			System.out.println(acc_no+""+name+""+amount);
	}
}