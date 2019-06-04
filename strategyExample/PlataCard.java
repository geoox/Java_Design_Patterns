package strategyExample;

public class PlataCard implements IStrategie{

	@Override
	public void plateste() {
		System.out.println("Se plateste cu cardul..");
	}

}
