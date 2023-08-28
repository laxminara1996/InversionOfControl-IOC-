package in.laxmi;

public class CreditCardPayment implements IPayment{
public CreditCardPayment() {
	System.out.println("credit card:: constructor");
}
	public boolean processPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("creditcard payment processed");
		return true;
	}

}
