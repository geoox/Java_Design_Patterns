package factoryExample2;

public class Gradina extends AObiectivTuristic{

	private int nrPlante;
	
	public Gradina(int nrPlante, String program, int capacitate) {
		super(program,capacitate);
		this.nrPlante = nrPlante;
	}
	
	@Override
	public void afiseazaDetalii() {
		super.afiseazaDetalii();
		System.out.println("Nr plante: "+this.nrPlante);
	}
	
}
