package hr.jere.pred7.model;

public  class Animal {
	
	private String name;
	private double weight;
	
	public Animal(String name,double weight){
		super();
		this.name=name;
		this.weight=weight;
	}
	
	public void SoundOfAnimal(){
		
		System.out.println(getName()+ " Animal sound");
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return getName()+" | "+getWeight();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Animal){
			Animal an = (Animal) obj;
			if(an.getName().equals(getName())&&an.weight == getWeight()){
				return true;
			}else
				return false;
		}else
			return false;
		
		
	}
	

}
