package strategyExample1;

public class Client implements ModPlata{
	String nume;
	ModPlata modPlata;
	
	public Client(String nume, ModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	@Override
	public void plateste() {
		this.modPlata.plateste();
	}
}
