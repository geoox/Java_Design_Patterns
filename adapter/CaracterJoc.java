package adapter;

public class CaracterJoc {
	String name;
	int points;
	
	
	public CaracterJoc(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	public void attack(String weapon) {
		System.out.println(this.name + " attacks with "+ weapon);
	}
	
	public void defend() {
		System.out.println(this.name + " defends");
		this.points -= 10;
	}
}
