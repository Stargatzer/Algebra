package hr.jere.pred7.model;

public class Dog extends Animal{

	private boolean isGuarding = false;
	
	public Dog(String name, double weight) {
		super(name, weight);
	}
	
	public void guardTheHouse(){
		isGuarding=true;
		System.out.println(getName()+" Is guarding the house");
	}
	
public void SoundOfAnimal(){
		
		System.out.println(getName()+ " Vau vau");
		
	}

@Override
public String toString() {
	return "Dog | "+  getName()+" | "+getWeight();
}

	
}
