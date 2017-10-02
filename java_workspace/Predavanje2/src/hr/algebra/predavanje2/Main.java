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
		//Scanner scanner = new Scanner(System.in);// novi objekt pomoæu
													// konstruktora klase
													// Scanner
		//System.out.println("Unesite broj");
		//int uneseniBroj = scanner.nextInt();
		//scanner.close();
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
		
		
		
		//ispis ocjene sukladno broju
		
		switch (uneseniBroj) {
		case 1:
			System.out.println("nedovoljan");
			break;
		case 2:
			System.out.println("dovoljan");
			break;
		case 3:
			System.out.println("dobar");
			break;
		case 4:
			System.out.println("vrlo dobar");
			break;
		case 5:
			System.out.println("odlièan");
			break;
		default:
			System.out.println("nije ocjena!");
			break;
		}
		
		//if else isto
		if (uneseniBroj == 1) {
			System.out.println("nedovoljan");
		} else if (uneseniBroj == 2) {
			System.out.println("dovoljan");
		} else if (uneseniBroj == 3) {
			System.out.println("dobar");
		} else if (uneseniBroj == 4) {
			System.out.println("vrlo dobar");
		} else if (uneseniBroj == 5) {
			System.out.println("odlican");
		}else{
			System.out.println("nije ocjena!");	
		}
		*/
		
		
		/*
		System.out.println("Jeronim Marinkoviæ \n" + "\nZagreb");
		
		//2
		Scanner scanner = new Scanner(System.in);
		System.out.println("prvi broj a =");
		int a = scanner.nextInt();
		System.out.println("b = ");
		int b = scanner.nextInt();
		System.out.println("a+b ="+ (a+b));
		
		//3
		System.out.println("\n\nunesi broj");
		int c = scanner.nextInt();
		boolean djeljs5 = c%5 == 0;
		if(djeljs5){
			System.out.println("djeljiv s 5");
		}
		else{
			System.out.println("nje djeljiv s 5");
		}
		
		
		
		// 4
		System.out.println("\n\nUnesi bodove");
		int bodovi = scanner.nextInt();
		int ocjena;
		if( bodovi >= 90 ){
			ocjena=5;			
		}else if( bodovi >= 80){
			ocjena = 4;
		}else if( bodovi >= 70){
			ocjena = 3;
		}else if( bodovi >= 60){
			ocjena = 2;
		}else {
			ocjena = 1;
		}
		
		switch (ocjena) {
		case 1:
			System.out.println("nedovoljan");
			break;
		case 2:
			System.out.println("dovoljan");
			break;
		case 3:
			System.out.println("dobar");
			break;
		case 4:
			System.out.println("vrlo dobar");
			break;
		case 5:
			System.out.println("odlièan");
			break;
		default:
			System.out.println("nije ocjena!");
			break;
		}
		
		
		//5
		
		System.out.println("\n\nprvi broj = ");
		a = scanner.nextInt();
		System.out.println("drugi broj= ");
		b = scanner.nextInt();
		System.out.println("treæi broj= ");
		c = scanner.nextInt();
		int najveci=0;
		
		/*
		if(a>=b&&a>=c){
			najveci=a;
		}else if(b>=a&&b>=c){
			najveci=b;
		}else if(c>=a&&c>=b){
			najveci=c;
		}
		*/
		//najveci = a <= b ? b : a;
		//najveci = najveci <= c ? c : najveci;
		
		
		//System.out.println("najveæi broj = "+ najveci );
		//scanner.close();
				
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double cijeli= Math.floor(a);		
		double decimalni = a-cijeli; 
			
		
		
		System.out.println("Upisani broj = "+a+"\ncijeli dio = "+cijeli+"\n decimalni dio = "+decimalni);
			
			
	}

}
