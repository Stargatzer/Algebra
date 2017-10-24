package hr.jere.predavanje8.interfaces;

public interface Pretvaranja {
	
	public static final double CuK=273.15, CuFFaktor=5D/9;//<naziv sucelja>.konstanta tako pozivamo
	
	double celzijusiUKelvine(double stupnjeviCelzijusovih);
	double celzijusiUFarenheite(double stupnjevaCelzijusovih);
	

}
