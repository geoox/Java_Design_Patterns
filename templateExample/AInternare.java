package templateExample;

public abstract class AInternare {
	public abstract void analizeaza();
	public abstract void verificaDispon();
	public abstract void emiteFisa();
	
	public void interneaza() {
		this.analizeaza();
		this.verificaDispon();
		this.emiteFisa();
	}
}
