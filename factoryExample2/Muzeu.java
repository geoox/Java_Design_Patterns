package factoryExample2;

public class Muzeu extends AObiectivTuristic{

	private int nrTablouri;
	
	public Muzeu(int nrTablouri, String program, int capacitate) {
		super(program, capacitate);
		this.nrTablouri = nrTablouri;
	}

	@Override
	public void afiseazaDetalii() {
		super.afiseazaDetalii();
		System.out.println("Nr tablouri: "+this.nrTablouri);
	}
	
	
	
}
