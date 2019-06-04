package flyweight;

public class Optional {
	int nrMasa;
	int nrPersoane;
	String oraRezervare;
	
	public Optional(int nrMasa, int nrPersoane, String oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public int getNrPersoane() {
		return nrPersoane;
	}

	public String getOraRezervare() {
		return oraRezervare;
	}
	
	
	
}
