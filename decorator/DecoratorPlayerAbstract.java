package decorator;

public class DecoratorPlayerAbstract implements IPlayer{
	
	IPlayer player;
	

	public DecoratorPlayerAbstract(IPlayer player) {
		super();
		this.player = player;
	}

	@Override
	public void shoot() {
		this.player.shoot();
	}

	@Override
	public void defend() {
		this.player.defend();
	}

	@Override
	public void getsInjured() {
		this.player.getsInjured();
	}

}
