package hr.jere.pred7.model;

public abstract class GeomLik {
	
	private double opseg,povrsina;
	
	public GeomLik(double opseg,double povrsina){
		this.opseg=opseg;
		this.povrsina=povrsina;
	}
	
	public static double prosjek(double...povrsine){
		double prosjek=0;
		for (int i = 0; i < povrsine.length; i++) {
			prosjek += povrsine[i]/povrsine.length;
		}
		return prosjek;
	}
	
	abstract void iscrtaj();

	public double getOpseg() {
		return opseg;
	}

	public void setOpseg(double opseg) {
		this.opseg = opseg;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	
	

}
