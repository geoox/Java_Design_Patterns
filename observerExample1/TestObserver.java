package observerExample1;

public class TestObserver {

	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		
		r.addObserver(c1);
		r.addObserver(c2);
		r.addObserver(c3);
		
		r.sendNotification("Salut, avem oferta la ceafa afumata");
	}

}
