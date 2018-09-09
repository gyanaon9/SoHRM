package JavaTpointE;

enum Peer{
	AA(100),BB(1000),CC(1000),DD(10000);
	int price;
	Peer(int price){
		this.price=price;
	}
	Peer(){
		this.price=100;
	}
	public int getPrice(){
		return price;
	}
}



public class EnumConP {

	public static void main(String[] args) {
		Peer[] b=Peer.values();
		for(Peer b1:b)
		{
			System.out.println(b1+"_____"+b1.getPrice());
		}
		
	}

}
