package adapter;

public class AdaptCaracterJocToSuperErou implements ISuperErou{
	// Object adapter
	// adapt object CaracterJoc to SuperErou by implementing ISuperErou

	private CaracterJoc caracter;
	
	public AdaptCaracterJocToSuperErou(CaracterJoc caracter) {
		this.caracter = caracter;
	}

	@Override
	public void attackEnemy(String enemy) {
		this.caracter.attack("AK47");
		System.out.println(this.caracter.name + " attacks "+enemy);
	}

	@Override
	public void isHit(int points) {
		this.caracter.defend();
		this.caracter.points -= points;
	}

	@Override
	public int getPoints() {
		return caracter.points;
	}

}
