package composite;

public class Sectie implements INod{
	String nume;
	int nrAngajati;
	
	public Sectie(String nume, int nrAngajati) {
		super();
		this.nume = nume;
		this.nrAngajati = nrAngajati;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	@Override
	public void addElement(INod nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void rmElement(INod nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public INod getElement(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void displayInfo() {
		System.out.println("Sectie: Nume: "+this.nume+", Angajati: "+this.nrAngajati);
		
	}

}
