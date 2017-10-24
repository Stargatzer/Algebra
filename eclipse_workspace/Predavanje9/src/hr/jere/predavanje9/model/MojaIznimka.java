package hr.jere.predavanje9.model;

public class MojaIznimka extends Exception{
	
	private String korisnik;

	public MojaIznimka(String poruka,String korisnik) {
		super(poruka);
		this.setKorisnik(korisnik);
	}

	public String getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}
	
	

}
