package hr.jere.pred7.model;

public class Osoba { //kao i da pi�e extends Object // ako stavimo final naslje�ivanje je isklju�eno
	private String ime,prezime,oib;
	//private final static int nesto = 5;  // Ne mo�emo dalje mjenjati
	
	

	public Osoba(String ime, String prezime, String oib) {
		super();//�emu ovo slu�i? zovemo klasu object default uvjek kao da pise extends object
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
	}
	
	//public Osoba(){}
		
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}
	
	
	

}
