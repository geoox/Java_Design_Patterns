package factoryExample4;

public abstract class AObiectivTuristic {
	private String denumire;
	private String adresa;
	
	public AObiectivTuristic(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}



	public abstract void getInfo();
}
