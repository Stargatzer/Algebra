package hr.jeronimmarinkovic.predavanje6.model;

public class Trokut {
	
	double a,b,c;
	
	public Trokut(double a,double b,double c){
		
		this.a=a;
		this.b=b;
		this.c=c;
			
		
	}
	
	public double Površina(){
		return a*b*c/3;
	}
	
	public double Opseg(){
		return a+b+c;
	}

}
