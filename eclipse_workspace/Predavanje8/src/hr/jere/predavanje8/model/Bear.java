package hr.jere.predavanje8.model;

import hr.jere.predavanje8.interfaces.EatAll;

public class Bear extends Animal implements EatAll{
	
	public Bear(String ime) {
		super(ime);
	}

	@Override
	public void jediMeso() {
		System.out.println("Medvjed " +getIme()+ " jede meso");
		
	}
	
	@Override
	public void jediBilje() {
		System.out.println("Medvjed " +getIme()+" jede bilje");
		
	}

	@Override
	public void jediRibu() {
		System.out.println("Medvjed " +getIme()+ " jede ribu");
		
	}
	
	@Override
	public void jedeSve() {
		System.out.println("****Medvjed " +getIme()+ " jede sve");
		jediMeso();
		jediRibu();
		jediBilje();
	}

}
