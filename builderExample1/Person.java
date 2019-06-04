package builderExample1;

public class Person {
	String name;
	String job;
	String university;
	boolean hasDrivingLicense;
	boolean isMarried;
	
	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
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
		Person p;

		public PersonBuilder(Person p) {
			super();
			this.p = p;
		}
		
		public PersonBuilder addJob(String job) {
			p.job = job;
			return this;
		}
		
		public PersonBuilder addUniversity(String university) {
			p.university = university;
			return this;
		}
		
		public PersonBuilder gotDrivingLicense() {
			p.hasDrivingLicense = true;
			return this;
		}
		
		public PersonBuilder gotMarried() {
			p.isMarried = true;
			return this;
		}
		
		public Person build() {
			return this.p;
		}
	}
	
}
