package command;

public class MasterCard implements OnlinePaymentInterface{
	
	OnlinePaymentProcessor processor;

	public MasterCard(OnlinePaymentProcessor processor) {
		super();
		this.processor = processor;
	}

	@Override
	public void onlinePay() {
		processor.processPayment(processor.processorName, "Plata cu MasterCard", 3200);
	}

}
