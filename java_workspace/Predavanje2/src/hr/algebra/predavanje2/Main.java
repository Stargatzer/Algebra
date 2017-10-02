package hr.algebra.predavanje2;

import java.util.Scanner; //Scanner je velikim poèetnim pa je klasa 

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
		
		//novi kod
		// matematièke funkcije i konstante
		
		
		/*
		 * // round & E 
		 * double mojBroj = 2.1239; System.out.println("E = " +
		 *Math.round(mojBroj * 1000) / 1000d); // metoda pow mojBroj = 40;
		 * double potencija = 2; System.out.println("40^2 = " +
		 * Math.pow(mojBroj, potencija));
		 */
		
		// unesite broj i izraèunajte njegov kvadrat (scanner) !
		Scanner scanner = new Scanner(System.in);// novi objekt pomoæu
													// konstruktora klase
													// Scanner
		System.out.println("Unesite broj");
		int uneseniBroj = scanner.nextInt();
		scanner.close();
		//System.out.println("unesen je broj " + uneseniBroj + " kvadrat broja = " + Math.pow(uneseniBroj, 2));

		// if primjer
		
		/*
		boolean punoljetan = uneseniBroj >= 18;
		boolean paran = (uneseniBroj % 2) == 0;
		if (punoljetan) {
			System.out.println("Punoljetan");
		} else {
			System.out.println("nije punoljetan");
		}
		
		//System.out.println("Kraj programa");
		*/
		
		
		//ispis ocjene sukladno broju
		
		switch (uneseniBroj) {
		case 1: System.out.println("nedovoljan");break;
		case 2: System.out.println("dovoljan");break;
		case 3: System.out.println("dobar");break;
		case 4: System.out.println("vrlo dobar");break;
		case 5: System.out.println("odlièan");break;
		default:System.out.println("nije ocjena!");
		break;
		}
		
		
		
	}

}
