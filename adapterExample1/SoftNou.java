package adapterExample1;

public class SoftNou {
	String infoBar;
	int nrClienti;
	
	public SoftNou(String infoBar, int nrClienti) {
		super();
		this.infoBar = infoBar;
		this.nrClienti = nrClienti;
	}
	
	public void RunBarPlusPlus() {
		System.out.println("Info bar: "+this.infoBar+", "+this.nrClienti+" clienti");
	}
}
