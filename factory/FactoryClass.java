package factory;

public class FactoryClass implements IFactory{
	
	private String name;
	private int age;
	private String height;

	public FactoryClass(String name, int age, String height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public void walk() {
		System.out.println(name + "walks !");
	}

	@Override
	public void sayHello() {
		System.out.println(name + "said hello !");
	}

	@Override
	public void sayGoodbye() {
		System.out.println(name + "said goodbye !");
	}

}
