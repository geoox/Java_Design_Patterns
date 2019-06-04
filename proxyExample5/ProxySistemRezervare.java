package proxyExample5;

public class ProxySistemRezervare implements ISistemRezervare{

	Rezervare rez;
	
	public ProxySistemRezervare(Rezervare rez) {
		super();
		this.rez = rez;
	}

	@Override
	public void rezervare() {
		if(this.rez.nrPersoane < 4) {
			System.out.println(rez.numePersoanaContact+", va rugam sa va prezentati la restaurant!");
		} else {
			Rezervare rezerv = new Rezervare(rez.nrPersoane, rez.numePersoanaContact);
			rezerv.mergeLaRestaurant();
		}
	}

}
