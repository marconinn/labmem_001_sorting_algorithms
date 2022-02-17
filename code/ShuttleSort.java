import java.util.Random;

public class ShuttleSort {
	int[] arr;
	
	ShuttleSort () {
		arr = array();
		System.out.println("|Shuttle sort                     |");
		System.out.println("|Source array:                    |");
		print(arr);
		System.out.println("|Sorted array:                    |");
		shuttleSort();
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
	
	private void shuttleSort () {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				swap(i, i - 1);
				for (int j = i - 1; (j - 1) >= 0; j--) {
					if (arr[j] < arr[j - 1]) {
						swap(j, j - 1);
					} else break;
				}
			}
		}
	}
	
	private void swap (int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
