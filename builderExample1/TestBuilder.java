package builderExample1;

import builderExample1.Person.PersonBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		Person p = new Person("Matei");
		Person pb = new PersonBuilder(p).addJob("teacher").addUniversity("CN RN").gotMarried().build();
		System.out.println(pb.getUniversity());
	}

}
