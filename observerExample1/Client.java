package observerExample1;

public class Client implements Observer{

	@Override
	public void receiveMessage(String message) {
		System.out.println("Received message by client: "+message);
	}

}
