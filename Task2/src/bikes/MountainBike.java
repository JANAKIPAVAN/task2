package bikes;

public class MountainBike extends Bicycle {
	
	private double gear_ratio;

	public MountainBike(double current_speed, double current_pedal_cadence, double current_gear,double gear_ratio) {
		super(current_speed, current_pedal_cadence, current_gear);
	this.gear_ratio=gear_ratio;
	}
	 
	 public void features() {
		 
		 System.out.print("\n mountain bikes have an additional chain ring, giving them a lower gear ratio :"+this.gear_ratio);
		 
	 }

	

}
