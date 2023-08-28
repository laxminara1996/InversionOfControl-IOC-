package in.laxmi;

public class PaymentService {
private IPayment payment;

public PaymentService(IPayment payment) {
	this.payment = payment;
}
public PaymentService() {
	System.out.println("paymentservice:: constructor");
}
public void setPayment(IPayment payment) {
	System.out.println("setter called");
	this.payment = payment;
}
 public void doPayment(double billAmt) {
	 boolean status=payment.processPayment(billAmt);
	 if(status) {
	System.out.println("print receipt");
	 }else {
		 System.out.println("payment declineds");
	 }
	 
}
}
