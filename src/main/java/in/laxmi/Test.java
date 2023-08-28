package in.laxmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ac= new ClassPathXmlApplicationContext("Beans.xml");
    PaymentService service = ac.getBean(PaymentService.class);
    service.doPayment(300.0);
	}

}
