package singleton;

public class SingletonClass {
	
	private static int number;
	private static String name;
	private static String location;
	
	// instance
	private static SingletonClass instance = null;
	
	private SingletonClass(int number, String name, String location) {
		super();
		this.number = number;
		this.name = name;
		this.location = location;
	}
	
	static {
		number = 10;
		name = "Mauricio";
		location = "Bucharest";
	}
	
	
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		SingletonClass.number = number;
	}

	public String getName() {
		return name;
	}

	public static void setName(String name) {
		SingletonClass.name = name;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		SingletonClass.location = location;
	}

	
	public static SingletonClass getInstance() {
		if(instance == null) {
			instance = new SingletonClass(number, name, location);
		}
		return instance;
	}
}
