package hr.jeronimmarinkovic.predavanje6.model;

public class Krug {
int x,y,r;
	
	public Krug(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
				
	}
	
	public double OpsegKruga(){
		return 2*r*Math.PI;
	}
	
	public double PovrsinaKruga(){
		return Math.pow(r, 2)*Math.PI;
	}
}
