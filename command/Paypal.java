package command;

public class Paypal implements OnlinePaymentInterface{
	
	OnlinePaymentProcessor processor;

	public Paypal(OnlinePaymentProcessor processor) {
		super();
		this.processor = processor;
	}

	@Override
	public void onlinePay() {
		processor.processPayment(processor.processorName, "Plata cu Paypal", 3200);
	}
}
