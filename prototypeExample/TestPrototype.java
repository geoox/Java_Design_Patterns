package prototypeExample;

public class TestPrototype {

	public static void main(String[] args) {
		Bot b1 = new Bot("Georgi", "Pistol fain");
		Bot b2 = new Bot("George", "Pistol urat");
		
		Bot b3 = (Bot) b1.cloneBot();
		Bot b4 = (Bot) b1.cloneBot();
		
		Bot b5 = (Bot) b2.cloneBot();
		Bot b6 = (Bot) b2.cloneBot();
		
		System.out.println("Boti Georgi:");
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();
		System.out.println("Boti George:");
		System.out.println(b5);
		System.out.println(b6);
		
	}

}
