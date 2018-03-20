package bikes;

public class Bicycle {
	
    private	double current_speed;
	private double current_pedal_cadence;
	private double current_gear;


public Bicycle(double current_speed, double current_pedal_cadence, double current_gear) {
	this.current_speed = current_speed;
	this.current_pedal_cadence = current_pedal_cadence;
	this.current_gear = current_gear;
}


public double getCurrent_speed() {
	return current_speed;
}

public void setCurrent_speed(int current_speed) {
	this.current_speed = current_speed;
}

public double getCurrent_pedal_cadence() {
	return current_pedal_cadence;
}

public void setCurrent_pedal_cadence(int current_pedal_cadence) {
	this.current_pedal_cadence = current_pedal_cadence;
}

public double getCurrent_gear() {
	return current_gear;
}

public void setCurrent_gear(int current_gear) {
	this.current_gear = current_gear;
}

public void CurrentSpeed() {
	System.out.print("\n current speed of the bicycle is :"+this.current_speed );
	
}
public void Current_pedal_cadence() {
	System.out.print("\n current pedal cadence of the bicycle is :"+this.current_pedal_cadence);
	
}
public void Current_gear() {
	System.out.print("\n current gear of the bicycle is :"+this.current_gear);
	
}
}
