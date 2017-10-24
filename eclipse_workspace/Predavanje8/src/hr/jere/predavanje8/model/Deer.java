package hr.jere.predavanje8.model;

import hr.jere.predavanje8.interfaces.Vegetarian;

public class Deer extends Animal implements Vegetarian{
	
	
	public Deer(String ime) {
		super(ime);
	}

	@Override
	public void jediBilje() {
		System.out.println("Jelen " +getIme()+ " jede bilje");
		
	}
	

}
