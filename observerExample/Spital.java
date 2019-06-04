package observerExample;

public class Spital extends ObservedSubject{
	public void notifyPacients(String message) {
		this.notifySubscribers(message);
	}
}
