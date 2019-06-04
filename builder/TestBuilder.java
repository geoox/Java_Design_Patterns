package builder;

import builder.BuilderClass.MiniBuilderClass;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderClass instance1 = new BuilderClass.MiniBuilderClass(10, "Matei")
				.addGender("Male")
				.addLocation("Bucharest")
				.build();
		
		BuilderClass instance2 = new BuilderClass.MiniBuilderClass(11, "Diana")
				.addGender("Female")
				.addLocation("Cluj")
				.build();
	}

}
