package stateExample;

public class Client {
	StareRezervare stare;
	String nume;
	
	public void setStare(StareRezervare stare) {
		this.stare = stare;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	
	public void faceRezervare() {
		this.stare = new StareRezervata();
		stare.afiseazaInfo();
	}
	
	public void ridicaRezervare() {
		this.stare = new StareOcupata();
		stare.afiseazaInfo();
	}
	
	public void pleaca() {
		this.stare = new StareLibera();
		stare.afiseazaInfo();
	}
	
}
