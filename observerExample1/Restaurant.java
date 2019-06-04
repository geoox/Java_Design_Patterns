package observerExample1;

import java.util.ArrayList;

public class Restaurant implements ObservedSubject{
	
	ArrayList<Observer> list = new ArrayList<>();

	@Override
	public void addObserver(Observer obs) {
		this.list.add(obs);
	}

	@Override
	public void rmObserver(Observer obs) {
		this.list.remove(obs);
	}

	@Override
	public void sendNotification(String message) {
		for(Observer obs:list) {
			obs.receiveMessage(message);
		}
	}

}
