package flyweight;

public class Client implements IRezervare{

	String nume;
	String numarTelefon;
	String adresaMail;
	
	public Client(String nume) {
		this.nume = nume;
	}
	
	public Client(String nume, String numarTelefon, String adresaMail) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.adresaMail = adresaMail;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public void setAdresaMail(String adresaMail) {
		this.adresaMail = adresaMail;
	}

	@Override
	public void displayInfo(Optional opt) {
		System.out.println();
		System.out.println(this.nume+", "+this.numarTelefon+", "+this.adresaMail);
		System.out.println("Optional info: "+opt.getNrMasa()+", "+opt.getNrPersoane()+", "+
				opt.getOraRezervare());
		System.out.println();
	}

}
