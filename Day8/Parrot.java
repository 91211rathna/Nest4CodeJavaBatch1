package day08;


	public class Parrot extends ConstructBirds implements FlyBehaviour {
		public void sound() {
			System.out.println("Parrot is screeching");
		}
		public void peck() {
			System.out.println("pecking");
		}
		public void eat2() {
			System.out.println("Parrot is eating insects");
		}
		public void fly() {
			System.out.println("Parrot can fly");
		}

	}

