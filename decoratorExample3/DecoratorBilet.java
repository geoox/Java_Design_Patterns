package decoratorExample3;

public class DecoratorBilet extends ADecorator{
	int nrZile;
	
	public DecoratorBilet(BiletIntrare bilet, int nrZile) {
		super(bilet);
		this.nrZile = nrZile;
	}

	@Override
	float getPret() {
		if(this.nrZile<5) {
			return (float) (bilet.getPret()*1.5);
		} else if(this.nrZile<15) {
			return (float) (bilet.getPret()*2);
		} else {
			return (float) (bilet.getPret()*3);
		}
	}
	
}
