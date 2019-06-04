package strategyExample;

public class TestStrategy {

	public static void main(String[] args) {
		Plata p = new Plata();
		PlataCard pc = new PlataCard();
		PlataCash pca = new PlataCash();
		
		p.modalitatePlata(pc);
		
		p.modalitatePlata(pca);
		
	}

}
