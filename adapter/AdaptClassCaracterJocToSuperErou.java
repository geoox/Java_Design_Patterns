package adapter;

public class AdaptClassCaracterJocToSuperErou extends CaracterJoc implements ISuperErou{

	public AdaptClassCaracterJocToSuperErou(String name, int points) {
		super(name, points);
	}

	@Override
	public void attackEnemy(String enemy) {
		this.attackEnemy(enemy);
		
	}

	@Override
	public void isHit(int points) {
		this.defend();
	}

	@Override
	public int getPoints() {
		return this.points;
	}

}
