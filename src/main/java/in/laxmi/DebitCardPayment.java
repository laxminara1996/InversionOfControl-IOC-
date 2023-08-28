package in.laxmi;

public class DebitCardPayment implements IPayment {
public DebitCardPayment() {
	System.out.println("debitcard :: constructor");
}
	public boolean processPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("debit card payment processed");
		return true;
	}

}
