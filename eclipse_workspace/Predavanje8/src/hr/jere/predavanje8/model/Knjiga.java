package hr.jere.predavanje8.model;

public class Knjiga implements Comparable<Knjiga>{
	
	private String ISBN,naslov,autor;
	private double cijena;

	@Override
	public int compareTo(Knjiga drugaKnjiga) {
		return -1*this.getAutor().compareTo(drugaKnjiga.autor);
//		if (this.cijena < drugaKnjiga.cijena) {
//			return -1;
//		}else if (this.cijena == drugaKnjiga.cijena) {
//			return 0;
//		}else
//			return 1;
	}

	public Knjiga(String iSBN, String naslov, String autor, double cijena) {
		super();
		ISBN = iSBN;
		this.naslov = naslov;
		this.autor = autor;
		this.cijena = cijena;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	@Override
	public String toString() {
		return "Knjiga [ISBN=" + ISBN + ", naslov=" + naslov + ", autor=" + autor + ", cijena=" + cijena + "]";
	}
	
	
	
	
	
	

}
