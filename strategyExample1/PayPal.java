package strategyExample1;

public class PayPal implements ModPlata{

	@Override
	public void plateste() {
		System.out.println("Se plateste cu Paypal..");
	}
	
}
