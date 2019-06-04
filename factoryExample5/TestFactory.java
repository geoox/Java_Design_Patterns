package factoryExample5;

public class TestFactory {

	public static void main(String[] args) {
		PersonalSpital p1 = FactoryPersonal.createPersonal(EnumPersonalSpital.ASISTENT, "Margela", 44);
		PersonalSpital p2 = FactoryPersonal.createPersonal(EnumPersonalSpital.BRANCARDIER, "Nicusor", 51);
		PersonalSpital p3 = FactoryPersonal.createPersonal(EnumPersonalSpital.MEDIC, "Monica", 35);

		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
	}

}
