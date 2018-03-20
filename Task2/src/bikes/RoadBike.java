package bikes;
enum drop_handlebar{yes,no}
public class RoadBike extends Bicycle{
	
	private drop_handlebar drop_handlebar;
 
	
	public RoadBike(double current_speed, double current_pedal_cadence, double current_gear,drop_handlebar drop_handlebar) {
		super(current_speed, current_pedal_cadence, current_gear);
		this.drop_handlebar=drop_handlebar;
	}

	public void features() {
		if(this.drop_handlebar==drop_handlebar.yes) {
			System.out.print("\nroad bikes have drop handlebars");
			
		}else {
			System.err.print("\nthis road bike don't have drop handlebars");
		}
		
	}
	
}
