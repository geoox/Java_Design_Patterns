package factoryExample5;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public void displayInfo() {
		System.out.println("BRANCARDIER!!!");
		super.displayInfo();
		System.out.println();
	}

	
}
