package no.hvl.uke36;

import java.util.Scanner;

public class Oppgave5 {

	// Oppgave 7 fra uke 35
	
	// Velger å bruke Scanner og ikke JOptionPane.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// For loop for deloppgave b
		for (int i = 0; i < 10; i++) {
			byte poeng = -1;

			// Loop som del av deloppgave c
			while (poeng < 0 || poeng > 100) {
				System.out.print("Poengsum: ");
				poeng = scanner.nextByte(); // Lagrer i en variabel av typen byte, siden poengsummen ikke overstiger
											// 100.
				if (poeng < 0 || poeng > 100) {
					System.out.println("Poeng må være mellom 0-100!");
				}
			}
			System.out.println("Karakter: " + getKarakter(poeng));

		}
		scanner.close();
	}

	private static char getKarakter(byte poeng) {
		if (poeng <= 39) {
			return 'F';
		} else if (poeng >= 40 && poeng <= 49) {
			return 'E';
		} else if (poeng >= 50 && poeng <= 59) {
			return 'D';
		} else if (poeng >= 60 && poeng <= 79) {
			return 'C';
		} else if (poeng >= 80 && poeng <= 89) {
			return 'B';
		} else {
			return 'A';
		}
	}

	
}
