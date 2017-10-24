package hr.jere.predavanje8.model;

import hr.jere.predavanje8.interfaces.Pretvaranja;

public class Termometar implements Pretvaranja{

	@Override
	public double celzijusiUKelvine(double stupnjeviCelzijusovih) {
		return stupnjeviCelzijusovih + Pretvaranja.CuK;
	}

	@Override
	public double celzijusiUFarenheite(double stupnjevaCelzijusovih) {
		return stupnjevaCelzijusovih*Pretvaranja.CuFFaktor+32;
	}
	
	

}
