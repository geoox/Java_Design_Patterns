package template;

import java.util.Arrays;

public class TestTemplate {
	
	public static void displayArr(Integer[] arr){
		for(Integer el:arr) {
			System.out.print(el+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,4,5,2,3,6,9,8,7};
		Integer[] arr2 = Arrays.copyOf(arr, arr.length);
		
		AscBubbleSort asc = new AscBubbleSort();
		asc.sort(arr);
		
		DescBubbleSort desc = new DescBubbleSort();
		desc.sort(arr2);
		
		displayArr(arr);
		displayArr(arr2);
	}

}
