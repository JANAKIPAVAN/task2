package bikes;

public class Test_bikes {

	public static void main(String[] args) {
	  MountainBike bike1= new MountainBike(11.5, 10.2, 3, 0.75);
	  RoadBike bike2= new RoadBike(30.5, 25.4, 4, drop_handlebar.yes);
      TandemBike bike3= new TandemBike(25.6, 12.6, 3, 2, 1);
      
      bike1.Current_gear();
      bike1.Current_pedal_cadence();
      bike1.CurrentSpeed();
      bike1.features();
      
      bike2.Current_gear();
      bike2.Current_pedal_cadence();
      bike2.CurrentSpeed();
      bike2.features();
      bike3.Current_gear();
      bike3.Current_pedal_cadence();
      bike3.CurrentSpeed();
      bike3.features();
	}

}
