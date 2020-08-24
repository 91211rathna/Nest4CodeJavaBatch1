public class Switch1 {
	double length_cm;
	double width_cm;
    String color;
    boolean is_Two_Way_Switch;
	boolean is_On;
	boolean is_Working = true;
	public static void main(String[] args){
		
	}

	public void turn_ON() {
		is_Two_Way_Switch = false;
		is_On = true;
		System.out.println("Switch is turned on");
	}
	public void turn_OFF() {
		is_Two_Way_Switch = false;
		is_On = false;
		System.out.println("Switch is turned off");
	}
	public void replace() {
		is_Working = false;
		System.out.println("Switch is not working so it should be REPAIRED");
	}
	
}