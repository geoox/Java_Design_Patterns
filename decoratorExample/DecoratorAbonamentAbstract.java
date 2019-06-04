package decoratorExample;

public abstract class DecoratorAbonamentAbstract extends ABiletIntrare{

	BiletIntrare bilet;
	
	public DecoratorAbonamentAbstract(BiletIntrare bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	float getPret() {
		return bilet.getPret();
	}
	
}
