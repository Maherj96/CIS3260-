


public class car {
	
	int gear = 1;
	int location;
	int speed = 0;
	int DESTINATION = 250;
	void reverseGear(){
		gear = -1;
	}
	void gearUp(){
		gear = gear + 1;
	}
	void gearDown(){
		gear = gear - 1;
	}
	
	int reportGear(){
		return gear;
	}
	
	int ReportLocation(){
		return location;
		
	}
	int ReportRemaining(){
		return DESTINATION - location; 
	}
	
	
		int time;
		
		
		void moveByTime(int i){
			speed = gear * 20;
			
		
			
		}

		boolean isArrived(){
			if(location >= DESTINATION);
			return true;
		}
	
			
		}
			
		
	
	
	

	


