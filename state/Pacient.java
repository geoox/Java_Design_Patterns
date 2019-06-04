package state;

public class Pacient {
	String nume;
	IStare stare;

	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.stare = (IStare) new StateInternat();
	}
	
	public void setStare(EnumStare stare) {
		if(stare == EnumStare.SUB_OBSERVATIE) {
			this.stare = new StateSubObservatie();
		}
		else if(stare == EnumStare.EXTERNAT) {
			this.stare = new StateExternat();
		}
		else {
			this.stare = new StateInternat();
		}
	}
	
	public void displayMessage(String message) {
		this.stare.mesajPacient(message);
	}
	
	

}
