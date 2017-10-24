package hr.jere.predavanje8.model;

public abstract class Animal {
	
	String ime;

	public Animal(String ime) {
		super();
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	

}
