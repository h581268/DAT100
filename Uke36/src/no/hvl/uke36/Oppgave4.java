package no.hvl.uke36;

import java.util.Scanner;

public class Oppgave4 {
	
	//Oppgave 6 fra uke 35
	
	// Velger å bruke Scanner og ikke JOptionPane.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Inntekt: ");
		int inntekt = scanner.nextInt();

		int trinn = sjekkTrinn(inntekt);
		System.out.println("Skatte trinn: " + trinn);
		System.out.println("Skatte %: " + getSkatteProsent(trinn) + "%");
		scanner.close();
	}

	private static int sjekkTrinn(int inntekt) {
		if (inntekt >= 180800 && inntekt <= 254500) {
			return 1;
		} else if (inntekt > 254500 && inntekt <= 639750) {
			return 2;
		} else if (inntekt > 639750 && inntekt <= 999550) {
			return 3;
		} else if (inntekt > 999550) {
			return 4;
		}
		return 0; // Dersom ingen trinn, returner 0.
	}

	private static double getSkatteProsent(int trinn) {
		switch (trinn) {
		case 1:
			return 1.9;
		case 2:
			return 4.2;
		case 3:
			return 13.2; // Tar utgangspunkt i at det ikke er Troms eller Finnmark. Der det er 11.2%
		case 4:
			return 16.2;
		default:
			return 0;
		}
	}
}
