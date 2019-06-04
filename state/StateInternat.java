package state;

public class StateInternat implements IStare{

	@Override
	public void mesajPacient(String mesaj) {
		System.out.println("Pacientul a fost internat. Mesajul lui este: "+mesaj);
	}
}
