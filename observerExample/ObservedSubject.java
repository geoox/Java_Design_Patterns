package observerExample;

import java.util.ArrayList;

public abstract class ObservedSubject {
	ArrayList<Observer> list = new ArrayList<>();
	
	void addSubscriber(Observer obs) {
		list.add(obs);
	}
	
	void rmSubscriber(Observer obs) {
		list.remove(obs);
	}
	
	void notifySubscribers(String message) {
		for(Observer el:list) {
			el.update(message);
		}
	}
}
