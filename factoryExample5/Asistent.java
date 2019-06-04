package factoryExample5;

public class Asistent extends PersonalSpital{

	public Asistent(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println("ASISTENT!!!");
		super.displayInfo();
		System.out.println();
	}
	
	

}
