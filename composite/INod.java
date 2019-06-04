package composite;

public interface INod {
	public void addElement(INod nod);
	public void rmElement(INod nod);
	public INod getElement(int index);
	
	public void displayInfo();
}
