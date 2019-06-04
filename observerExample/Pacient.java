package observerExample;

public class Pacient extends Observer{
	
	String name;

	public Pacient(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name + " listens to the message: "+message);
	}

}
