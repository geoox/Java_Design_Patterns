package observer;

public class TestObserver {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		
		Student s01 = new Student("Dragomir");
		Student s02 = new Student("Marinel");
		
		s01.listenTo(teacher);
		s02.listenTo(teacher);
		
		teacher.teach("Java programming");
	}

}
