package hr.jeronimmarinkovic.predavanje6.model;

import hr.jeronimmarinkovic.predavanje6.utils.Konstante;

public class Student {  //extends jo� implements  
	//public - dostupna klasa vugdje
	//private - izvan klase nije dostupno
	//protected - pristupaju metode iz klase
	//bez - klasa samo u paketu dostupna
	
	//VARIJABLE//
	private int id;  //kori�tenje samo unutar klase mo�emo definirati defaultne vrijednosti
	private String ime;
	private String prezime;
	
	private static int avalibleId=Konstante.STUDENT_START_ID;
	
	//KONSTRUKTOR je uvjek public, mo�emo ih imati vi�e
	public static int GetAvaid(){
		return avalibleId;
	}
	
	public Student(String ime, String prezime){
		SetID();
		this.ime=ime;
		this.prezime=prezime;
	}
	
	public void SetID(){
		id = avalibleId;
		avalibleId++;
	}
//	
//	public Student(int id){
//		this.id=id;
//	}
//	
//	public Student(){//konstruktor mo�e imati isti naziv ali ne iste parametre
//	}
	
	//metode tako�er mogu imati isto ime ALI moraju imati razli�ite parametre
	
	public void ispisPodataka(){
		System.out.println("\nIme: " + ime); //scope varijable unutar klase
		System.out.println("Prezime: " + prezime);
		System.out.println("Id: " + id);
	}
	
	public void ispisPodataka(int i){ //preoptere�enje metoda i konstruktora
		System.out.println("\nIme: " + ime); //scope varijable unutar klase
		System.out.println("Prezime: " + prezime);
		System.out.println("Id: " + id);
	}
	
	public String getIme(){ //getter dohva�anje varijable iz klase
		return ime;
	}
	
	
	public void setIme(String novoIme){
		ime = novoIme;
	}

	public int getId() {
		return id;
	}
			//ID setter ne vrijedi jer je samo jednom postavljen
//	public void setId(int id) {
//		if (this.id != -1) //unutar metode referiranje na varijablu instance
//			System.out.println("\nId je ve� generiran: " + this.id);
//		else
//			this.id = id;
//	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	
	
	
//	public void ispis2(){
//		for (int i = 0; i < 10; i++) {
//			int b = i;// b �ivi samo unutar petlje nanovo se stvara u petlji
//			
//		}
		
		
//	}
	
	

}
