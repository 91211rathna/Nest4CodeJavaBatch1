public class Switch2 {
	double length_cm;
	double width_cm;
    String color;
    boolean is_Two_Way_Switch;
	boolean is_On;
	boolean is_Working = true;
	public Switch2(double l,double w,String c,boolean is_2way,boolean is_on,boolean is_working) {
		length_cm = l;
		width_cm = w;
		color = c;
		is_Two_Way_Switch = is_2way;
		is_On = is_on;
		is_Working = is_working;
	}	

	public static void main(String[] args) {
		Switch1 switch_1 = new Switch1();
		switch_1.length_cm = 5.2;
		switch_1.width_cm = 3.0;
		switch_1.color = "white";
		System.out.println("switch_1 state:");
		switch_1.turn_ON();
	    switch_1.replace();
	    
		Switch1 switch_2 = new Switch1();
		switch_2.length_cm = 5.6;
		switch_2.width_cm = 3.0;
		switch_2.color = "white";
		System.out.println();
		System.out.println("switch_2 state:");
		switch_2.turn_OFF();
	    switch_2.replace();
	    
		Switch1 switch_3 = new Switch1();
		switch_3.length_cm = 5.8;
		switch_3.width_cm = 3.0;
		switch_3.color = "white";
		System.out.println();
		System.out.println("switch_3 state:");
		switch_3.turn_ON();
		
		Switch1 switch_4 = new Switch1();
		switch_4.length_cm = 6.0;
		switch_4.width_cm = 3.0;
		switch_4.color = "white";
		System.out.println();
		System.out.println("switch_4 state:");
		switch_4.turn_ON();
		
		Switch1 switch_5 = new Switch1();
		switch_5.length_cm = 6.2;
		switch_5.width_cm = 3.5;
		switch_5.color = "white";
		switch_5.is_Two_Way_Switch = true;
		System.out.println();
		System.out.println("switch_5 state:");
		System.out.println("Switch is 2-way so ON or OFF state can't be determined");
		
		

	}
	public void display() {
		System.out.println("length_cm is "+length_cm);
		System.out.println("width_cm is "+width_cm);
		System.out.println("color is " +color);
		System.out.println("is_Two_Way_Switch "+is_Two_Way_Switch);
		System.out.println("is_On "+is_On);
		System.out.println("is_Working "+is_Working);
	}

}
s