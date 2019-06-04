package decoratorExample2;

public class Printare extends APrintare{
	
	Printare(int pret){
		this.pret = pret;
	}

	@Override
	void printare() {
		System.out.println("Costul este de "+this.pret+". Se printeaza foaia...");
	}
	
}
