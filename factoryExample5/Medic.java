package factoryExample5;

public class Medic extends PersonalSpital{

	public Medic(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public void displayInfo() {
		System.out.println("MEDIC!!!");
		super.displayInfo();
		System.out.println();
	}
	
	
	
}
