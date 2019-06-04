package proxyExample5;

public class Rezervare {
	
	int nrPersoane;
	String numePersoanaContact;
	
	public Rezervare(int nrPersoane, String numePersoanaContact) {
		super();
		this.nrPersoane = nrPersoane;
		this.numePersoanaContact = numePersoanaContact;
	}
	
	public int getNrPersoane() {
		return nrPersoane;
	}
	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}
	public String getNumePersoanaContact() {
		return numePersoanaContact;
	}
	public void setNumePersoanaContact(String numePersoanaContact) {
		this.numePersoanaContact = numePersoanaContact;
	}
	
	public void mergeLaRestaurant() {
		System.out.println(this.numePersoanaContact+" merge la restaurant cu "+this.nrPersoane+" persoane");
	}
}
