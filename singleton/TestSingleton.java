package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		
		System.out.println(instance1.getName());
		System.out.println(instance2.getName());
	}

}
