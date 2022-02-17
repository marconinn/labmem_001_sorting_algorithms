import java.util.Random;

public class BubbleSort {
	int[] arr;
	
	BubbleSort () {
		arr = array();
		System.out.println("|Bubble sort                      |");
		System.out.println("|Source array:                    |");
		print(arr);
		System.out.println("|Sorted array:                    |");
		bubbleSort();
		print(arr);
	}
	
	private int[] array ()
	{
		int[] arr;
		arr = new int[10];
		Random random = new Random ();
		for (int i=0; i<10; i++) {
			arr[i] = 1 + random.nextInt(20)+1;
		}
		return arr;
	}
	
	private void print (int[] arr) {
		System.out.printf("| ");
		for (int i=0; i<arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		System.out.printf("\n");
	}
	
	private void bubbleSort () {
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j<arr.length-1; j++) {
				if (arr[j]>arr[j+1]) swap(j, j+1);
			}
		}
	}
	
	private void swap (int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
