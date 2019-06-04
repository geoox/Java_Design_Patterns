package templateExample1;

public class Masa1 extends AOcupareMasa{

	@Override
	public void curatareMasa() {
		System.out.println("Masa 1: Se curata masa..");
	}

	@Override
	public void asezareServetele() {
		System.out.println("Masa 1: Se aseaza servetelele..");
	}

	@Override
	public void asezareTacamuri() {
		System.out.println("Masa 1: Se aseaza tacamurile..");
	}

	@Override
	public void invitarePersoane() {
		System.out.println("Masa 1: Sunt invitate persoanele..");
	}

}
