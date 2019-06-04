package decoratorExample;

public class DecoratorAbonament extends DecoratorAbonamentAbstract{
	
	int nrZile;
	
	public DecoratorAbonament(BiletIntrare bilet, int nrZile) {
		super(bilet);
		this.nrZile = nrZile;
	}
	
	@Override
	float getPret() {
		if(nrZile < 1) {
			return bilet.getPret();
		} else if (nrZile<10) {
			return (float)1.5*bilet.getPret();
		} else if(nrZile<30) {
			return 2*bilet.getPret();
		}
		return 3*bilet.getPret();
		
	}

}
