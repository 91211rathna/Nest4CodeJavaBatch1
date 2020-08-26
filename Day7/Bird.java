package day7;

public abstract class Bird {
	
public static void main(String[] args) {
int length;
int weight;
int breadth;
String colour;
Ostrich OstrichObj=new Ostrich();
OstrichObj.fly();
Parrot ParrotObj=new Parrot();
ParrotObj.fly();
		
}
public void eat() {
System.out.println("eating");
}

public void sleep() {
System.out.println("sleeping");
}

public abstract void fly();

public abstract void sound();
}
