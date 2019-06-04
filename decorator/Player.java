package decorator;

public class Player implements IPlayer{
	protected String name;
	protected int number;
	protected boolean isInjured;
	
	public Player(String name, int number, boolean isInjured) {
		super();
		this.name = name;
		this.number = number;
		this.isInjured = isInjured;
	}
	@Override
	public void shoot() {
		System.out.println(this.name +"("+this.number+") shoots!");
	}
	@Override
	public void defend() {
		System.out.println(this.name +"("+this.number+") defends!");
	}
	@Override
	public void getsInjured() {
		System.out.println(this.name +"("+this.number+") gets injured!");
		this.isInjured = true;
	}
}
