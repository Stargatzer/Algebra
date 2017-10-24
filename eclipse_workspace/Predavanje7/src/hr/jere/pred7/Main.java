package hr.jere.pred7;

import java.util.ArrayList;

import hr.jere.pred7.model.Animal;
import hr.jere.pred7.model.Cat;
import hr.jere.pred7.model.Dog;
import hr.jere.pred7.model.GeomLik;
import hr.jere.pred7.model.Krug;
import hr.jere.pred7.model.Kvadrat;
import hr.jere.pred7.model.Osoba;
import hr.jere.pred7.model.Profesor;
import hr.jere.pred7.model.Student;
import hr.jere.pred7.model.Trokut;

public class Main {

	public static void main(String[] args) {
		
//		Osoba o = new Osoba("Ivo","Iviæ","123");
//		Student s = new Student("Ana", "Aniæ", "321"); // obje klase najnormalnije definiramo
//		Profesor p = new Profesor("Dane", "Daniæ", "232");
		
//		System.out.println(s.getJmbag());
//		System.out.println("S == O " + (s instanceof Osoba));
//		System.out.println("P == O " + (p instanceof Osoba));
//		System.out.println("O == S " + (o instanceof Student));
//		
//		s=(Student)o; // možemo ga castati jer ima više osobina a ne manje koristimo caast operator
		
		
		//System.out.println("Ime: " + s.getIme()+"    Prezime: "+s.getPrezime());
		
		//Dog d = new Dog("miško", 22.1);
		
		ArrayList<Object> kingdom = new ArrayList<>();
		
		kingdom.add(new Animal("Poo", 12.1));
		kingdom.add(new Dog("Old Ay", 20));
		kingdom.add(new Cat("garfield", 50));
		kingdom.add(new Animal("Maro", 1));
		kingdom.add(new Dog("Èupko", 1));
		kingdom.add(new Cat("Kila", 234));
		
		
		ArrayList<GeomLik> likovi = new ArrayList<>();
		
		
		likovi.add(new Krug(12.21,12));
		likovi.add(new Trokut(1,23));
		likovi.add(new Kvadrat(2,3));
		likovi.add(new Trokut(2,4));
		likovi.add(new Krug(1,3.45));
		likovi.add(new Krug(4.345,234.34));
		likovi.add(new Trokut(3,34));
		likovi.add(new Krug(342,32));
		likovi.add(new Kvadrat(32,33));
		likovi.add(new Krug(34,324));
		
		for (int i = 0; i < likovi.size(); i++) {
			if(likovi.get(i) instanceof Trokut)
				((Trokut) likovi.get(i)).iscrtaj();
			if(likovi.get(i) instanceof Kvadrat)
				((Kvadrat) likovi.get(i)).iscrtaj();
			if(likovi.get(i) instanceof Krug)
				((Krug) likovi.get(i)).iscrtaj();

		}
		
		double[] povrs = new double[likovi.size()];
		
		for (int i = 0; i < povrs.length; i++) {
			povrs[i]=likovi.get(i).getPovrsina();
		}
		
		System.out.println(GeomLik.prosjek(povrs));
		
		
		
//		for (int i = 0; i < kingdom.size(); i++) {
//			
//			if(kingdom.get(i) instanceof Dog){
//				((Dog) kingdom.get(i)).guardTheHouse();	
//			}else if(kingdom.get(i) instanceof Cat){
//				((Cat) kingdom.get(i)).startChasing();				
//			}else{
//				((Animal)kingdom.get(i)).SoundOfAnimal();
//			}
//	
//		}
		
		
//		Dog killer = new Dog("Èupko", 1);
		//kingdom.add(killer);
		
//for (int i = 0; i < kingdom.size(); i++) {
//	
//	if(kingdom.get(i).equals(killer)){
//		System.out.println(((Animal)kingdom.get(i))+" Je Killer!!!");
//	}else{
//		System.out.println("no match = "+((Animal)kingdom.get(i))+"    !=    "+killer.toString());
//	}
//	//((Animal)kingdom.get(i)).SoundOfAnimal();
//	//System.out.println(((Animal)kingdom.get(i)).toString());
//			
////			if(kingdom.get(i) instanceof Dog){
////				((Dog) kingdom.get(i)).guardTheHouse();}
//	
//		}
		


		
		
		
	}

}
