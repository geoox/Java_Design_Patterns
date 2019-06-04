package strategyExample1;

public class TestStrategy {
	public static void main(String[] args) {
		PayPal paypal = new PayPal();
		Client co = new Client("Matei", paypal);
		co.plateste();
		
		Cash cash = new Cash();
		Client cc = new Client("Mateias", cash);
		cc.plateste();
	}
}
