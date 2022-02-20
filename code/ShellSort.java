import java.util.Random;

public class ShellSort {
	int[] arr;
	
	ShellSort () {
		arr = array();
		System.out.println("|Shuttle sort                     |");
		System.out.println("|Source array:                    |");
		print(arr);
		System.out.println("|Sorted array:                    |");
		shellSort();
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
	
	private void shellSort () {
		int gap = arr.length / 2;
		while (gap >= 1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if (arr[j] > arr[j + gap]) {
						swap(j, j + gap);
						}
					}
				}
		    gap = gap / 2;
		    }
	}
	
	private void swap (int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
