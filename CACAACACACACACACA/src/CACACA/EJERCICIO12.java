package CACACA;
import java.util.Scanner;
public class EJERCICIO12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;

		do {

			System.out.println("Escriba un número mayor que 0");
			i = scanner.nextInt();
			

		}

		while (i <= 0);
		scanner.close();
		
		for (j = 1; j <= i; j++) {
			if(j==1) {
				System.out.print(" __");
			}
			else {
				System.out.print("___");
			}
		}
		System.out.println();

		for (j = 1; j <= i; j++) {
			System.out.print("|");
			System.out.print("__");

			if (j == i) {
				System.out.println("|");

				for (k = 2; k <= i; k++) {

					for (j = 1; j <= i; j++) {
						System.out.print("|");
						System.out.print("__");

						if (j == i) {
							System.out.println("|");
						}
					}

				}

			}

		}
		
	}

}
