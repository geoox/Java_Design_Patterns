package strategyExample1;

public class Card implements ModPlata{

	@Override
	public void plateste() {
		System.out.println("Se plateste prin intermediul cardului..");
	}

}
