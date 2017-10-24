package hr.jere.pred7.model;

public class Cat extends Animal {
	
	private boolean isChasingMice= false;

	public Cat(String name, double weight) {
		super(name, weight);
		//SoundOfAnimal();//metoda iz natklase ako je oznacimo kao private nemožemo je koristiti u ovoj podklasi
	}
	
	public void startChasing(){
		isChasingMice=true;
		System.out.println(getName()+ " is now chasing mice");
		
	}

	public void startChasing(boolean state){
		isChasingMice=state;
		if(state){
			System.out.println(getName()+ "is chasing mice");
		}else{
			System.out.println(getName()+ " is hungry");	
		}
		
		
	}
	
public void SoundOfAnimal(){
		
		System.out.println(getName()+ " Mjau,Mjau");
		
	}

}
