package command;

import java.util.ArrayList;

// Invoker

public class PaymentSystem {
	public ArrayList<OnlinePaymentInterface> list;
	
	PaymentSystem(){
		this.list = new ArrayList<>();
	}
	
	void addPayment(OnlinePaymentInterface payment){
		this.list.add(payment);
	}
	
	void sendPayments() {
		for(OnlinePaymentInterface el:list) {
			el.onlinePay();
		}
		this.list.clear();
	}
}
