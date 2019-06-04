package decoratorExample3;

public class BiletIntrare extends ABiletIntrare{
	private boolean ghid;
	
	BiletIntrare(boolean ghid, int pret){
		super();
		this.ghid = ghid;
		this.pret = pret;
	}
	
	@Override
	float getPret() {
		if(ghid == true)
			return this.pret * 0.5f;
		else
			return this.pret;
	}

}
