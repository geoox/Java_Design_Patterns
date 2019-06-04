package factoryExample2;

public class AObiectivTuristic implements IObiectiveTuristice{

	private String program;
	private int capacitate;
	
	
	public AObiectivTuristic(String program, int capacitate) {
		super();
		this.program = program;
		this.capacitate = capacitate;
	}

	@Override
	public void afiseazaDetalii() {
		System.out.println("Program: "+this.program+"; Capacitate: "+this.capacitate);
	}

}
