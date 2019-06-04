package builderExample;

public class Person {
	String name;
	String job;
	String university;
	boolean hasDrivingLicense;
	boolean isMarried;
	
	private Person(String name, String job, String university, boolean hasDrivingLicense, boolean isMarried) {
		super();
		this.name = name;
		this.job = job;
		this.university = university;
		this.hasDrivingLicense = hasDrivingLicense;
		this.isMarried = isMarried;
	}
	
	private Person() {
		
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String getUniversity() {
		return university;
	}

	public boolean isHasDrivingLicense() {
		return hasDrivingLicense;
	}

	public boolean isMarried() {
		return isMarried;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		this.hasDrivingLicense = hasDrivingLicense;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public static class PersonBuilder{
		Person person = null;
		
		public PersonBuilder(String name) {
			person = new Person();
			person.setName(name);
		}
		
		
		
		@Override
		public String toString() {
			String s = person.getName()+", "+person.getJob()+", "+person.getUniversity()+", "+person.isHasDrivingLicense()+", "+person.isMarried();
			return s;
		}


		public PersonBuilder addJob(String job) {
			person.job = job;
			return this;
		}
		
		public PersonBuilder addUniversity(String university) {
			person.setUniversity(university);
			return this;
		}
		
		public PersonBuilder gotDrivingLicense() {
			person.setHasDrivingLicense(true);
			return this;
		}
		
		public PersonBuilder gotMarried() {
			person.setMarried(true);
			return this;
		}
		
		public Person build() {
			return this.person;
		}
		
	}
	
}
