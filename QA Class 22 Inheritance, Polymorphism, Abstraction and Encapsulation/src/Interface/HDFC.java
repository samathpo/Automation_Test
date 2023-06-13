package Interface;

public class HDFC implements CentralBank {

	public static void main(String[] args) {
		
 HDFC h = new HDFC();
 h.savings();
 h.creditcard();

	}

	@Override
	public void savings() {
		System.out.println("HDFC savings");
		
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC creditcard");
	}



	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
