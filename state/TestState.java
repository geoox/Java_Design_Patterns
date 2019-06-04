package state;

public class TestState {

	public static void main(String[] args) {
		Pacient p = new Pacient("Matei");
		p.displayMessage("Salut!");
		
		p.setStare(EnumStare.SUB_OBSERVATIE);
		p.displayMessage("O nu!");
		
		p.setStare(EnumStare.EXTERNAT);
		p.displayMessage("Sunt liber!");
	}

}
