package hr.algebra.predavanje2;

import java.util.Scanner; //Scanner je velikim početnim pa je klasa 

public class Main {
	
/*
 * 
 * alt 91 [
 * alt 93 ]
 * alt+64 = @
 * 123 }
 * 125 [
 * ctrl+shift+f format code
 */
	
	public static void main(String[] args) {
		
		
		// matematičke funkcije i konstante
		
		
		/*
		 * // round & E 
		 * double mojBroj = 2.1239; System.out.println("E = " +
		 *Math.round(mojBroj * 1000) / 1000d); // metoda pow mojBroj = 40;
		 * double potencija = 2; System.out.println("40^2 = " +
		 * Math.pow(mojBroj, potencija));
		 */
		
		// unesite broj i izračunajte njegov kvadrat (scanner) !
		Scanner scanner = new Scanner(System.in);//novi objekt pomoću konstruktora klase Scanner
		System.out.println("Unesite broj");
		int uneseniBroj = scanner.nextInt();		
		System.out.println("unesen je broj "+uneseniBroj+" kvadrat broja = "+Math.pow(uneseniBroj, 2));
		
		
		
	}

}
