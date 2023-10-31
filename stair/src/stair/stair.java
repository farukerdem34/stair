package stair;

import java.util.Scanner;

public class stair {
	// Ömer Faruk ERDEM
	// ***
	// Computer Education and Instructional Technology
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner scanner = new Scanner(System.in);

		// Get input of stair.
		System.out.print("Basamak sayısı girin: ");
		int basamak_sayisi = scanner.nextInt();
		scanner.close();

		// Print the number of stairs.
		for (int i = 0; i < basamak_sayisi; i++) {
			print_basamak(i);
		}
	}

	// Print single stair.
	private static void print_basamak(int basamak_sayisi) {
		// Declare width and height values.
		int height = 3;
		int width = 6;

		for (int i = 0; i < height; i++) {
			if (i == 0) {
				print_basamak_tab(basamak_sayisi);
				for (int j = 0; j < width; j++) {
					// Print stair ground.
					System.out.print("_");
				}
				System.out.print(" ");
				System.out.println(basamak_sayisi + 1);
			} else {
				print_basamak_tab(basamak_sayisi);
				for (int j = 0; j < width; j++) {
					// Print stair gap.
					System.out.print(" ");
				}
				// Print end of the stair.
				System.out.print("|");
				System.out.println();
			}
			// Prepare program for the next stair.
			System.out.println();
		}
	}

	// Print tab (\t) between two stairs.
	private static void print_basamak_tab(int basamak_sayisi) {
		for (int j = 0; j < basamak_sayisi; j++) {
			System.out.print("\t");
		}
	}
}
