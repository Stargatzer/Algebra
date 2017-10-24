package hr.jere.predavanje8.model;

public class Zaposlenik implements Comparable<Zaposlenik>{
	
	private String ime,prezime;
	private double placa;
	
	

	public Zaposlenik(String ime, String prezime, double placa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.placa = placa;
	}

	@Override
	public int compareTo(Zaposlenik o) {
//		if (this.getPlaca()< o.getPlaca() ) {
//			return -1;
//		}else if (this.getPlaca() == o.getPlaca()) {
//			return 0;
//		}else
//		return 1;
		int vrati=this.getIme().compareTo(o.getIme());
		if(vrati==0){
			vrati=this.getPrezime().toLowerCase().compareTo(o.getPrezime().toLowerCase());
		}
		return vrati;
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

	public double getPlaca() {
		return placa;
	}

	public void setPlaca(double placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Zaposlenik [ime=" + ime + ", prezime=" + prezime + ", placa=" + placa + "]";
	}
	
	
	

}
