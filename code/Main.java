import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("|__labmem_002_sorting_algorithms__|");
		Scanner scanner = new Scanner (System.in);
		int exit = 0;
		do {
			System.out.println("|Choose method:                   |");
			System.out.println("|1)Bubble sort                    |");
			System.out.println("|2)Selection Sort                 |");
			System.out.println("|3)Insertion Sort                 |");
			System.out.println("|4)Shuttle Sort                   |");
			System.out.println("|5)Shell Sort                     |");
			System.out.println("|0)Exit                           |");
			System.out.printf("|>> ");
			String ch = scanner.nextLine();
			switch (ch) {
			case ("1"):
			{
				System.out.println();
				BubbleSort sort = new BubbleSort ();
				System.out.println();
			}
			break;
			case ("2"):
			{
				System.out.println();
				SelectionSort sort = new SelectionSort ();
				System.out.println();
			}
			break;
			case ("3"):
			{
				System.out.println();
				InsertionSort sort = new InsertionSort ();
				System.out.println();
			}
			break;
			case ("4"):
			{
				System.out.println();
				ShuttleSort sort = new ShuttleSort ();
				System.out.println();
			}
			break;
			case ("5"):
			{
				System.out.println();
				ShellSort sort = new ShellSort ();
				System.out.println();
			}
			break;
			case ("0"):
			{
				exit = 1;
				System.out.println();
			}
			break;
			default: {
				System.out.println("|Invalid_character________________|");
				System.out.println();
			}
			}
		} while (exit==0);
		System.out.println("|________________Made_by_MarconiNN|");
		scanner.close();
	}
}
