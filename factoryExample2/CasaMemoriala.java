package factoryExample2;

public class CasaMemoriala extends AObiectivTuristic{
	private int vechime;
	
	public CasaMemoriala(int vechime, String program, int capacitate) {
		super(program, capacitate);
		this.vechime = vechime;
	}
	
	@Override
	public void afiseazaDetalii() {
		super.afiseazaDetalii();
		System.out.println("Vechime: "+this.vechime);
	}
}
