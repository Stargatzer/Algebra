package hr.jeronimmarinkovic.predavanje6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import hr.jeronimmarinkovic.predavanje6.model.Student;
import hr.jeronimmarinkovic.predavanje6.model.Zaposlenik;

public class Main {

	public static void main(String[] args) {
		
//		ArrayList<Student> registar = new ArrayList<>();
//		registar.add(new Student("Gea", "Gei�"));
//		registar.add(new Student("Marko", "Marki�"));
//		registar.add(new Student("Lana", "Ivanovi�"));
//		registar.add(new Student("Lovro", "Klase"));
//		registar.add(new Student("Ivana", "Koncul"));
//		registar.add(new Student("Ivo", "Potestot"));
//
//	
//	
//	for(int i = 0; i <registar.size();i++){
//		if(registar.get(i).getIme().equals("Lovro")&&registar.get(i).getPrezime().equals("Klase"))
//			registar.get(i).ispisPodataka();
//		}
		
		ArrayList<Zaposlenik> registar = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("\n\nUnesite ime Zaposlenika");
			String ime = s.nextLine();
			System.out.println("Unesite prezime Zaposlenika");
			String prezime = s.nextLine();
			System.out.println("Unesite pla�u Zaposlenika");
			double placa = s.nextDouble();
			registar.add(new Zaposlenik(ime, prezime, placa));
			s.close();
			
		}
		
		registar.get(1).getPlacaZaposlenika()
		
		//System.out.println("Prosjek pla�e = " + Zaposlenik.Prosjek(registar));
		//System.out.println("Najpla�eniji radnik" + Zaposlenik.Najve�i(registar));
		
		
	}

}
