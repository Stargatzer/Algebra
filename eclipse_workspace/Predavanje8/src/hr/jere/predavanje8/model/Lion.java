package hr.jere.predavanje8.model;

import hr.jere.predavanje8.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore{

	public Lion(String ime) {
		super(ime);
	}

	@Override
	public void jediMeso() {
		System.out.println("Lav " +getIme()+ " jede meso");
		
	}
	
	

}
