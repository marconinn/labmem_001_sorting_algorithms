import java.util.Random;

public class SelectionSort {
	int[] arr;
	
	SelectionSort () {
		arr = array();
		System.out.println("|Selection sort                   |");
		System.out.println("|Source array:                    |");
		print(arr);
		System.out.println("|Sorted array:                    |");
		selectionSort();
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
	
	private void selectionSort () {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(i, min);
		}
	}
	
	private void swap (int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
