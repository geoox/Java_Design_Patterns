package observerExample1;

public interface ObservedSubject {
	void addObserver(Observer obs);
	void rmObserver(Observer obs);
	void sendNotification(String message);
}
