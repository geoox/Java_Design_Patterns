package template;

public abstract class TemplateMethodBubbleSort {
	abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
	final void sort(Integer[] list) {
		if(numbersInCorrectOrder(list[0], list[1])) {
			int n = list.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (list[j] > list[j+1]) 
	                { 
	                    int temp = list[j]; 
	                    list[j] = list[j+1]; 
	                    list[j+1] = temp; 
	                } 
		} else {
			int n = list.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (list[j] < list[j+1]) 
	                { 
	                    int temp = list[j]; 
	                    list[j] = list[j+1]; 
	                    list[j+1] = temp; 
	                } 
		}
	}
}
