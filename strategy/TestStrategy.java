package strategy;

public class TestStrategy {
	public static void main(String[] args) {
		SortingStrategy bubble = new BubbleSort();
		SortingStrategy merge = new MergeSort();
		
		ChooseStrategy.getSortingAlgorithm(bubble);
		System.out.println("Another sorting alg");
		ChooseStrategy.getSortingAlgorithm(merge);
	}
}
