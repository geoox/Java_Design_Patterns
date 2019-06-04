package command;

public class VISA implements OnlinePaymentInterface{

	
	OnlinePaymentProcessor processor;	

	public VISA(OnlinePaymentProcessor processor) {
		super();
		this.processor = processor;
	}

	@Override
	public void onlinePay() {
		processor.processPayment("Matei", "Plata cu VISA", 2000);
	}
	
	

}
