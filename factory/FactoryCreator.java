package factory;

public class FactoryCreator {
	public static IFactory getPeople(String gender, String name, int age, String height){
		IFactory instance = null;
		switch(gender) {
			case "Male":{
				instance = new Man(name,age,height);
				break;
			}
			case "Female":{
				instance = new Woman(name, age, height);
				break;
			}
		}
		return instance;
	}
}
