import java.util.Random;

public class InsertionSort {
	int[] arr;
	
	InsertionSort () {
		arr = array();
		System.out.println("|Insertion sort                   |");
		System.out.println("|Source array:                    |");
		print(arr);
		System.out.println("|Sorted array:                    |");
		insertionSort();
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
	
	private void insertionSort () {
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (value < arr[j]) {
					arr[j + 1] = arr[j];
				} else break;
			}
			arr[j + 1] = value;
		}
	}
}
