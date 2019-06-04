package factoryExample5;

public class PersonalSpital implements IPersonalSpital{
	String nume;
	int varsta;
	
	public PersonalSpital(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "PersonalSpital [nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public void displayInfo() {
		System.out.println("PersonalSpital [nume=" + nume + ", varsta=" + varsta + "]");
	}
	
	
}
