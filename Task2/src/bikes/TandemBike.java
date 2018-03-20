package bikes;

public class TandemBike extends Bicycle {
	
	private int seats;
	private int handlebar;
	public TandemBike(double current_speed, double current_pedal_cadence, double current_gear,int seats,int handlebar) {
		super(current_speed, current_pedal_cadence, current_gear);
	this.seats=seats;
	this.handlebar=handlebar;
	}
	
	
	public boolean check_seats() {
		
		if(this.seats==2) {
			return true;
		}else {
			return false;
		}
	}
	public boolean check_handlebar() {
		
		if(this.handlebar==2) {
			return true;
		}else {
			return false;
		}
	}

	
	public void features() {
		if(check_seats() && check_handlebar()) 
		{System.out.println("\n tandem bicycles have two seats and two sets of handlebars ");
		}else if (check_seats()) {
			System.out.println("\n tandem bicycles have only two seats ");
			
		}else if(check_handlebar()) {
			System.out.println("\n tandem bicycles have only two sets of handlebars ");
			
		}else {
			System.err.print("\n This particular tandem bicycle have "+this.seats+"set seats and "+this.handlebar+" sets of handlebars");
		}
		
	}
}
