package prototypeExample3;

public class ContClient implements IContClient{
	String nume;
	int varsta;
	
	public ContClient() {
		
	}
	
	public ContClient(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public Object cloneObj() {
		ContClient c = new ContClient();
		
		c.setNume(this.nume);
		c.setVarsta(this.varsta);
		
		return c;
	}
	
	
}
