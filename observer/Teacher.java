package observer;

public class Teacher extends ObservedSubject {
	public void teach(String subject) {
		this.notifyObservers(subject);
	}
}
