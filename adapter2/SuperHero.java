package adapter2;

public class SuperHero implements IHero{
	
	String name;

	public SuperHero(String name) {
		super();
		this.name = name;
	}

	@Override
	public void attacks(String enemy) {
		System.out.println(this.name + " attacks " + enemy);
	}

	@Override
	public void defends() {
		System.out.println(this.name+" defends");
	}

}
