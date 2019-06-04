package composite;

public class Departament implements INod {
	
	String nume;
	

	public Departament(String nume) {
		super();
		this.nume = nume;
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
		System.out.println("Departament: Nume: "+this.nume);
	}

}
