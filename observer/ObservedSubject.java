package observer;

import java.util.ArrayList;

public abstract class ObservedSubject {
	
	ArrayList<Observer> list = new ArrayList<>();
	void register(Observer obj) {
		list.add(obj);
	}
	
	void unregister(Observer obj) {
		list.remove(obj);
	}
	
	void notifyObservers(String message) {
		for(Observer el:list) {
			el.update(message);
		}
	}
}
