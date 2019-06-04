package adapter;

public class SuperErou implements ISuperErou{
	String name;
	int points;
	String weapon;
	
	
	
	public SuperErou(String name, int points, String weapon) {
		super();
		this.name = name;
		this.points = points;
		this.weapon = weapon;
	}
	
	@Override
	public void attackEnemy(String enemy) {
		System.out.println(this.name + " attacks " + enemy);
	}
	@Override
	public void isHit(int points) {
		System.out.println(this.name + " is hit. His life decreases by "+points);
		this.points-=points;
	}
	@Override
	public int getPoints() {
		return this.points;
	}
}
