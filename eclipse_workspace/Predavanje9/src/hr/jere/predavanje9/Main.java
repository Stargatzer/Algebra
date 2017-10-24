package hr.jere.predavanje9;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

import hr.jere.predavanje9.model.MojaIznimka;
import hr.jere.predavanje9.model.Zaposlenik;

/**
 * 
 * @author Jeronim Marinkovi�
 *
 *   ////gre�ke
 *   
 *   rje�avanje kraha aplikacije, reakcija na gre�ke da se program ne bi crasha
 *   
 *   iznimke se u kodu rje�avaju pomo�u try/catch/finally blokova
 *   
 *   kod u kojem se de�ava gre�ka stavimo u try blok ako se greska desi imamo catch koji izvrsava ako se desila ge�ka
 *   
 *   problematican kod inace ide u try catch blokove
 */

public class Main {

	public static void main(String[] args) {
		
		kalkulator();
	}
	
	private static String currentUser;
	
	private static void logirajKorisnika(String korisnik){
		currentUser=korisnik;
	}
	
	private static void primjer1(){
		int prviBroj = 7, drugiBroj = 0;

		try {
			int rezultat = prviBroj / drugiBroj;
			System.out.println("Rezultat iznosi " + rezultat);
		} catch (Throwable e) {
			System.out.println("Dogodila se iznimka " + e.getMessage());
		} finally {
			System.out.println("Kalkuliranje je gotovo");//uvjek se izvr�ava!! bez obzira na gre�ku, mo�da osloba�anje resursa. ne izvr�ava se ako imamo system.exit() ili jvm krepa
			//beskona�na petlja u try bloku
		}

		System.out.println("Izvr�avanje programa je zavr�eno");
	}
	
	private static void primjer2(){
		try {
			ArrayList<String> nizZnakova = new ArrayList<String>();
			
			while(true){
				nizZnakova.add("Novi Znak niz");
			}
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

	private static void primjer3(){


		
		
		Scanner scn = new Scanner(System.in);
		int broj = 0;
		String unos=String.valueOf(broj); //sve tipove mo�emo staviti za parametre
		try {
			//broj=new Integer(unos);
			broj=Integer.parseInt(scn.nextLine());//double.parsedouble()
		} catch (NumberFormatException e) {//na razli�ite tipove gre�aka reagiramo razli�ito
			System.out.println("Unjeli ste pogre�an unos");
			System.out.println("Postavljamo unosu vrijednost 1");
			broj=1;
			e.printStackTrace();//ovo lijepo u log file
		}
	}
	
	private static void primjer4(){
		
		Scanner scn = new Scanner(System.in);
		int broj = 0;
		String unos = "234d";
		int[] polje = { 1, 2, 3 };

		try {
			// !.gre�ka
			//broj = new Integer(unos);
			//broj = polje[5];
			broj = broj / 0;
		} catch (NumberFormatException e) {
			System.out.println("Gre�ka pri konverziji znakovnog");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Gre�ka pri pristupu elementu polja");
		} catch (Exception e) {
			System.out.println("Sve ostale gre�ke");
		}

	}

	private static void primjer5(){
		
//		try {
//			double rezultat = izracunajKorjen(-1);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			double rezultat = izracunajKorjen(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static double izracunajKorjen(double broj) throws Exception /*Numberformatexception,dawd .....*/{
			if(broj<0.0){
				throw new Exception("Negativna vrijednost");
			}
			return Math.sqrt(broj);
	}
	
	private static void primjer6(){
		
//		try {
//			double rezultat = izracunajKorjen(-1);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		logirajKorisnika("Jere");
		try {
			double rezultat = izracunajKorjen6(-1);
		} catch (MojaIznimka e) {
			e.printStackTrace();
			System.out.println(e.getKorisnik());
		}
}
	

	public static double izracunajKorjen6(double broj) throws MojaIznimka /*Numberformatexception,dawd .....*/{
	if(broj<0.0){
		throw new MojaIznimka("Negativna vrijednost!!",currentUser);
	}
	return Math.sqrt(broj);
}


	private static void primjer7(){
		ArrayList<Zaposlenik> list = new ArrayList<>();
		list.add(new Zaposlenik(1, "Ivo Ivi�", 14500));
		list.add(new Zaposlenik(2, "Kemo Malet", 1500));
		list.add(new Zaposlenik(3, "Lino Turkovi�", 4500));
		
		//brisanje iz liste
		
		for (int i = 0; i < list.size() ; i++) {
			if (list.get(i).getId()==2 && list.get(i).getName().equals("Kemo Malet")) {
				list.remove(i);
			}
		}
		
		for (int i = 0; i < list.size() ; i++) {
			if (list.get(i).getId()==3&& list.get(i).getName().equals("Lino Turkovi�")) {
				list.set(i, new Zaposlenik(6, "Mato Kova�", 12000));
			}
		}
		
		for(Zaposlenik z: list){
			System.out.println(z.toString());
		}
	}

	
	private static void zadatak1(){
		int polje[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Unisi pet brojeva");
		for (int i = 0; i < polje.length; i++) {
			try {
				polje[i] = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("To nije broj, pokusajte ponovno");
			}finally {
				scan.close();
			}
		}
		
	}

	private static void zadatak2(){
		Scanner scan = new Scanner(System.in);
		int broj;
		while(true){
		try {
			broj = scan.nextInt();
			break;
		} catch (Exception e) {
		
 		}
		}
	}

	private static void zadatak3(){
		
		double a = enterDecimalNum();
		System.out.println("a = "+a);
		
	}
	private static double enterDecimalNum(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Unesi broj");
		double num;
		try {
			num = Double.parseDouble(scn.nextLine().replaceAll(",", "."));
		} catch (NumberFormatException e) {
			num = enterDecimalNum();
		}
		return num;
	}

	private static void kalkulator(){
		double a,b;
		double zbroj=0;
		double razlika=0;
		double umnozak=0;
		double djeljenje=0;
		//a = b = zbroj = razlika = umnozak = djeljenje = 0;
		Scanner scn = new Scanner(System.in);
		a = enterDecimalNum();
		b = enterDecimalNum();
		
		try {
			zbroj = a + b;
			razlika = a - b;
			umnozak = a*b;
			djeljenje =a/b;
		} catch (Exception e) {
			System.out.println("gre�ka pri operaciji"+e.getMessage());
			djeljenje = 0;
		}
		
		System.out.println(a+"+"+b+"="+zbroj+"     "+a+"-"+b+"="+razlika+"   "+a+"*"+b+"="+umnozak+"  "+a+"/"+b+"="+djeljenje);
		
		
	}
}
