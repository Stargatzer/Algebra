package hr.jere.predavanje10.model;

public class Osoba {
	private String ime,prezime;
	private int god;
	
	
	
	public Osoba(String ime, String prezime, int god) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.god = god;
	}
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
	public int getGod() {
		return god;
	}
	public void setGod(int god) {
		this.god = god;
	}
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", god=" + god + "]";
	}
	
	

}
