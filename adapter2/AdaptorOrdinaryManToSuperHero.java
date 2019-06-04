package adapter2;

public class AdaptorOrdinaryManToSuperHero implements IOrdinaryMan{

	// adapt super hero to ordinary man
	
	IHero hero;
	
	@Override
	public void walks() {
		this.hero.defends();
	}

	@Override
	public void talks(String companion) {
		this.hero.attacks(companion);
	}

}
