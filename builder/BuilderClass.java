package builder;

public class BuilderClass {
	
	private int number;
	private String name;
	private String location;
	private boolean isInjured;
	private String gender;
	
	private BuilderClass() {
	}

	private BuilderClass(int number, String name, String location, boolean isInjured, String gender) {
		super();
		this.number = number;
		this.name = name;
		this.location = location;
		this.isInjured = isInjured;
		this.gender = gender;
	}
	
	
	
	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setInjured(boolean isInjured) {
		this.isInjured = isInjured;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public static class MiniBuilderClass {
		
		private BuilderClass instance;
		
		public MiniBuilderClass(int number, String name) {
			instance = new BuilderClass();
			instance.setNumber(number);
			instance.setName(name);
		}
		
		public MiniBuilderClass addLocation(String newLoc) {
			instance.location = newLoc;
			return this;
		}
		
		public MiniBuilderClass addGender(String newGender) {
			instance.gender = newGender;
			return this;
		}
		
		public BuilderClass build() {
			return this.instance;
		}
	}

}
