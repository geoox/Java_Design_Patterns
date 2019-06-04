package state;

public class StateExternat implements IStare{

	@Override
	public void mesajPacient(String mesaj) {
		System.out.println("Starea de sanatate a pacientului este foarte buna. "
				+ "Acesta a fost externat. Mesajul lui este: "+mesaj);
	}



}
