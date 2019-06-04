package command;

public abstract class OnlinePaymentProcessor{
	String processorName;
	
	public OnlinePaymentProcessor(String processorName){
		this.processorName = processorName;
	}
	
	public abstract void processPayment(String clientName, String eventName, double amount);
}
