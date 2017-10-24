package hr.jere.predavanje8;

import java.util.ArrayList;
import java.util.Collections;

import hr.jere.predavanje8.interfaces.Carnivore;
import hr.jere.predavanje8.interfaces.EatAll;
import hr.jere.predavanje8.interfaces.Vegetarian;
import hr.jere.predavanje8.model.Animal;
import hr.jere.predavanje8.model.Bear;
import hr.jere.predavanje8.model.Deer;
import hr.jere.predavanje8.model.Knjiga;
import hr.jere.predavanje8.model.Lion;
import hr.jere.predavanje8.model.Termometar;
import hr.jere.predavanje8.model.Zaposlenik;

/**
 * 
 * @author Jeronim Marinkoviæ
 * suèelja
 * umjesto class ide interface modifikatori slicni
 * sadrži nešto drukciju funkcionalnost
 * sastoji se od konstanti i/ili spstaraktnih metoda svev mora biti final i static
 * metode nemaju tijelo
 *suèelje specificira skup metoda koje specificiraju ponašanje nekih klasa
 *kreiramo sucelje i dodajemo našoj klasi npr student, impl suèelje prijavi ispit
 *tako imamo sogovor sa klsom student tako da svi mogu prijaviti ispit, ili ih morao implementirati
 *klasa se obvezuje imati propisane stvari u suèelja, klase mogu imati standardno suèelje
 *pri deklariranju metode u suèelju navodi se iskljuèivo njen potpis ne moramo imati abstract
 *
 *suèelja imaju svrhu tek u implementaciji u klasama.
 *
 *implementiranjem suèelja u klasi mora definirati sve metode u suèelju
 *ako ne implementira može biti abstraktna klasa
 */
public class Main {

	public static void main(String[] args) {
		
//		int tempInput = 30;
//		System.out.println("C : "+tempInput);
//		Termometar termometar = new Termometar();
//		System.out.println("CuF : "+termometar.celzijusiUFarenheite(tempInput));
//		System.out.println("CuK : "+termometar.celzijusiUKelvine(tempInput));
		
//		ArrayList<Animal> zivotinjskoCarstvo = new ArrayList<>();
//		
//		zivotinjskoCarstvo.add(new Deer("Miško"));
//		zivotinjskoCarstvo.add(new Lion("Brko"));
//		zivotinjskoCarstvo.add(new Bear("Paško"));
//		zivotinjskoCarstvo.add(new Lion("Repko"));
//		zivotinjskoCarstvo.add(new Lion("Matko"));
//		zivotinjskoCarstvo.add(new Deer("Brzi"));
//		zivotinjskoCarstvo.add(new Deer("Spori"));
//		zivotinjskoCarstvo.add(new Bear("Lovac"));
//		zivotinjskoCarstvo.add(new Bear("Debeli"));
//		zivotinjskoCarstvo.add(new Lion("Šmrko"));
//		zivotinjskoCarstvo.add(new Deer("Miško"));
//		
//		System.out.println("-----------------BILJOJEDI---------------");
//		for (int i = 0; i < zivotinjskoCarstvo.size(); i++) {
//			
//			if (zivotinjskoCarstvo.get(i) instanceof Vegetarian) {
//				Vegetarian v = (Vegetarian) zivotinjskoCarstvo.get(i);
//				v.jediBilje();
//			}
//	
//		}
//		
//		System.out.println("-----------------MESOJEDI---------------");
//		for (int i = 0; i < zivotinjskoCarstvo.size(); i++) {
//			
//			if (zivotinjskoCarstvo.get(i) instanceof Carnivore) {
//				Carnivore v = (Carnivore) zivotinjskoCarstvo.get(i);
//				v.jediMeso();
//			}
//	
//		}
//		
//		
//		System.out.println("-----------------SVEJEDI---------------");
//		for (int i = 0; i < zivotinjskoCarstvo.size(); i++) {
//			
//			if (zivotinjskoCarstvo.get(i) instanceof EatAll) {
//				EatAll v = (EatAll) zivotinjskoCarstvo.get(i);
//				v.jedeSve();
//			}
//	
//		}
		
//		ArrayList<Knjiga> zivotinjskoCarstvo = new ArrayList<>();
//		
//		zivotinjskoCarstvo.add(new Knjiga("123", "Java EE", "Jendrock", 630));
//		zivotinjskoCarstvo.add(new Knjiga("23141", "Java native interface", "Liang",440));
//		zivotinjskoCarstvo.add(new Knjiga("3412", "JDBC", "Aisher", 770));
//		zivotinjskoCarstvo.add(new Knjiga("2753", "JFC", "Zalrath", 550));
//		
//		System.out.println("Katalog prije sortiranja");
//		
//		for (int i = 0; i < zivotinjskoCarstvo.size(); i++) {
//			System.out.println(zivotinjskoCarstvo.get(i).toString());
//		}
//		
//		Collections.sort(zivotinjskoCarstvo);
//		
//		System.out.println("\nKatalog poslje sortiranja");
//		
//		for (int i = 0; i < zivotinjskoCarstvo.size(); i++) {
//			System.out.println(zivotinjskoCarstvo.get(i).toString());
//		}
		
		
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		
		zaposlenici.add(new Zaposlenik("Maja", "Majiæ", 5234));
		zaposlenici.add(new Zaposlenik("Ivo", "Makam", 52454));
		zaposlenici.add(new Zaposlenik("Tomao", "Bajo", 4234));
		zaposlenici.add(new Zaposlenik("Adi", "Medfiæ", 5934));
		zaposlenici.add(new Zaposlenik("Tera", "Era", 4134));
		zaposlenici.add(new Zaposlenik("Drago", "Zeus", 5234));
		zaposlenici.add(new Zaposlenik("Timo", "Ariæ", 5234));
		zaposlenici.add(new Zaposlenik("Timo", "Zen", 5234));
		
		System.out.println("Katalog prije sortiranja");
		
		for (int i = 0; i < zaposlenici.size(); i++) {
			System.out.println(zaposlenici.get(i).toString());
		}
		
		Collections.sort(zaposlenici);
		
		System.out.println("\nKatalog poslje sortiranja");
		
		for (int i = 0; i < zaposlenici.size(); i++) {
			System.out.println(zaposlenici.get(i).toString());
		}
		
	}

}
