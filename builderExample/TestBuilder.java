package builderExample;

import builderExample.Person.PersonBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		PersonBuilder p1 = new Person.PersonBuilder("Matei").addUniversity("none").gotDrivingLicense();
		
		System.out.println(p1.toString());
	}

}
