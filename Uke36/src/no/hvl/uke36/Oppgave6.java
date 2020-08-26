package no.hvl.uke36;

import java.util.Scanner;

public class Oppgave6 {
	
	// Velger recursion og ikke løkker for dette da det er mer effektivt og er ikke spesifisert i oppgaven hvilken metode man skal bruke.
	// Velger å bruke long i oppgaven isteden for int for å ikke begrense n=12. Med long begrenses den til n=20.
	// For å kunne gå høyre enn dette, kreves det mye mer koding der man for eksempel lager en int[MAX_N] og lagrer hvert tall på den måten.
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Heltall å finne fakultetet av: ");
		try {
			long i = scanner.nextInt();	
			System.out.println("Fakultetet av " + i + " er: " + factorial(i));
		} catch (Exception except) {
			System.out.println("Bruk kun heltall!");
		}
		scanner.close();
		
	}
	
	private static long factorial(long i) {
		if (i > 0) {
			return i * factorial(i - 1);
		} else {
			return 1;
		}
	}
}
