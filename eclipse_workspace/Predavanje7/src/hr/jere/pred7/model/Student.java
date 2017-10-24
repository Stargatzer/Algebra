package hr.jere.pred7.model;

public final class Student extends Osoba {
	
	public Student(String ime, String prezime, String oib) { //postavljamo konstruktor zbog konstruktora osobe, podaci od osobe moraju biti uneseni
		super(ime, prezime, oib); //vrati vrijednosti konstruktoru osobe
	}

	private String jmbag;

	public String getJmbag() {
		//super.getIme();//možemo pozvati neku metodu iz superklase
		return jmbag;
	}

	public void setJmbag(String jmbag) {
		this.jmbag = jmbag;
	}

}
