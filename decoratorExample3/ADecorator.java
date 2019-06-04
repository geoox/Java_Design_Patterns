package decoratorExample3;

public class ADecorator extends ABiletIntrare{
	
	BiletIntrare bilet;

	public ADecorator(BiletIntrare bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	float getPret() {
		return bilet.getPret();
	}

}
