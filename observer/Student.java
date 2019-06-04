package observer;

public class Student implements Observer{
	String name;
	
	Student(String name){
		super();
		this.name = name;
	}
	
	public void listenTo(ObservedSubject teacher) {
		teacher.list.add(this);
	}
	
	@Override
	public void update(String message) {
		System.out.println("Student " + this.name + " learns " + message);
	}
}
