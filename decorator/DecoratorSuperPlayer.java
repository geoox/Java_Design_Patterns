package decorator;

public class DecoratorSuperPlayer extends DecoratorPlayerAbstract{

	public DecoratorSuperPlayer(IPlayer player) {
		super(player);
	}
	
	int fans;

	public int getFans() {
		return fans;
	}

	public void setFans(int fans) {
		this.fans = fans;
	}

	@Override
	public void shoot() {
		System.out.println("Super player SCORES!");
	}
	
	

}
