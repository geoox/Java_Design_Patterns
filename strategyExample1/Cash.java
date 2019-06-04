package strategyExample1;

public class Cash implements ModPlata{

	@Override
	public void plateste() {
		System.out.println("Se plateste cash..");
	}

}
