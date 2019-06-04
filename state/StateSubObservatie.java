package state;

public class StateSubObservatie implements IStare{

	@Override
	public void mesajPacient(String mesaj) {
		System.out.println("Starea de sanatate a pacientului se agraveaza. "
				+ "Mesajul lui este: "+mesaj);
	}



}
