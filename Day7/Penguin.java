package day7;
public abstract class Penguin extends Bird implements Swimbehaviour{
public void sound() {
System.out.println("Penguin is honking");
}
public void swim() {
System.out.println("can swim");
}

}