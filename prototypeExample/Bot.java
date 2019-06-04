package prototypeExample;

public class Bot implements IPrototype{
	String name;
	String weapon;
	
	public Bot() {
		
	}
	
	public Bot(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	@Override
	public Object cloneBot() {
		Bot cloneBot = new Bot();
		cloneBot.name = this.name;
		cloneBot.weapon = this.weapon;
		
		return cloneBot;
		
	}

	@Override
	public String toString() {
		return "Bot [name=" + name + ", weapon=" + weapon + "]";
	}
	
	
	
}
