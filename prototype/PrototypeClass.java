package prototype;

public class PrototypeClass implements IPrototype{
	
	private String name;
	private String location;
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public PrototypeClass(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	private PrototypeClass() {
		
	}

	@Override
	public Object cloneObj() {
		PrototypeClass newObj = new PrototypeClass();
		newObj.location = this.location;
		newObj.name = this.name;
		return newObj;
	}

}
