package flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		Optional opt = new Optional(10, 4, "10:00");
		Optional opt2 = new Optional(11, 2, "20:30");
		Client c = FlyweightFactory.getClient("Matei","0812587","asgjn@asg.ac");
		c.displayInfo(opt);
		c.displayInfo(opt2);
	}

}
