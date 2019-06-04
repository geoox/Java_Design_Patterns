package compositeExample;


public interface INod {

	public void addNode(INod nod);
	public void rmNode(INod nod);
	public INod getNode(int i);
	public void displayInfo();
	public void addItem(Item item);
}
