package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		IPlayer player1 = new Player("Mutu", 10, false);
		IPlayer player2 = new Player("Surdu", 9, false);
		
		DecoratorSuperPlayer player3 = new DecoratorSuperPlayer(player2);
		player3.setFans(100000);
		player1.shoot();
		player2.defend();
		player3.shoot();
		player2.getsInjured();
	

	}

}
