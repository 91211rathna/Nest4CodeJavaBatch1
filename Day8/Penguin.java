package day08;

public class Penguin extends ConstructBirds implements SwimBehaviour {
	public void sound() {
		System.out.println("Penguin is honking");
	}
	public void peck() {
		System.out.println("cannot peck");
	}
	public void eat() {
		System.out.println("Penguin is eating");
	}
	public void swim() {
		System.out.println("Penguin can Swim");
	}
	public void eat1() {
		// TODO Auto-generated method stub
		System.out.println("Penguin is eating meat");
		
	}


}
