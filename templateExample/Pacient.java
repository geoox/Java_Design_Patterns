package templateExample;

public class Pacient extends AInternare {

	@Override
	public void analizeaza() {
		System.out.println("Se analizeaza..");
	}

	@Override
	public void verificaDispon() {
		System.out.println("Se verifica disponibilitatea..");
	}

	@Override
	public void emiteFisa() {
		System.out.println("Se emite fisa..");
	}

	
}
