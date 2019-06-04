package observerExample;

public class TestObserver {

	public static void main(String[] args) {
		Pacient p = new Pacient("Matei");
		Pacient p2 = new Pacient("Diana");
		Pacient p3 = new Pacient("Arthur");
		
		Spital s = new Spital();
		s.addSubscriber(p);
		s.addSubscriber(p2);
		s.addSubscriber(p3);
		
		s.notifySubscribers("Virusul A88 a fost complet distrus");
	}

}
