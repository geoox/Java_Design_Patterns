package proxyExample4;

public class Persoana {
	String nume;
	boolean areAsigurareMedicala;
	
	public Persoana(String nume, boolean areAsigurareMedicala) {
		super();
		this.nume = nume;
		this.areAsigurareMedicala = areAsigurareMedicala;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean isAreAsigurareMedicala() {
		return areAsigurareMedicala;
	}

	public void setAreAsigurareMedicala(boolean areAsigurareMedicala) {
		this.areAsigurareMedicala = areAsigurareMedicala;
	}
	
	
}
