package myCampusTour.builderWorkshop;
import myCampusTour.myTour.*;
import myCampusTour.driver.*;

public class Builder implements BuilderWorkshopI{
    Tour tourObj;
	int pickingGift = 10;
	public Builder() {
		
	}

    // Enums 
	
	enum Building{
		SOM(60),
		Watson(60),
		Hinnman(60),
		ScienceLibarary(60),
		BartleLib(60);
		
		private int value;
		
		Building(int value) {
			this.value = value;
		}
	}
	
	enum visitingOptions{
		busRide(3),
		onFoot(1);
		
		private int value;
        static int duration = 10;
		static int carbon_footprint = 6;
		static int effort = 15;
		
		visitingOptions(int value) {
			this.value = value;
		}
	}
	
	enum lectType{
		CS542(0),                  // In person class
		CS540(10);                  // Online hence 10% surcharge
		
		private int value;
        static int cost = 20;
        static int duration = 10;
		static int carbon_footprint = 10;
		static int effort = 12;

		
		lectType(int value) {
			this.value = value;
		}
	}
	
	enum pickingGiftLocation{
		eventCenter(0),                  
		universityUnion(0);             
		
		private int value;
        static int duration = 5;
		static int carbon_footprint = 7;
		static int effort = 20;
		
		pickingGiftLocation(int value) {
			this.value = value;
		}
	}
	
	enum foodType{
		queue(0),
		online(5);   //5% surcharge
		
		private int value;
        static int cost =100;
        static int duration = 20;
		static int carbon_footprint = 12;
		static int effort = 300;
		
		foodType(int value) {
			this.value = value;
		}
	}
	
	public void construct(Tour obj) {
		Calculate cal = new Calculate();
		this.tourObj = obj; 
	
	        int foodCost = foodType.cost + (foodType.cost*foodType.valueOf(tourObj.getFoodType()).value)/100;  // 5% surcharge
			int visitingCost = visitingOptions.valueOf(tourObj.getVistingOption()).value;
			int lectureCost = lectType.cost + (lectType.cost*lectType.valueOf(tourObj.getLectType()).value)/100;  //10% surcharge
			int visitduration = visitingOptions.duration + (visitingOptions.valueOf(tourObj.getVistingOption()).value)/100;
			int lectduration = lectType.duration + (lectType.duration*lectType.valueOf(tourObj.getLectType()).value)/50;
			int foodduration = foodType.duration + (foodType.duration*foodType.valueOf(tourObj.getFoodType()).value)/100; //calculating duration depending on the food type
			int visitcarbon = visitingOptions.carbon_footprint + (visitingOptions.valueOf(tourObj.getVistingOption()).value)/100;
			int lectcarbon = lectType.carbon_footprint+ (lectType.carbon_footprint*lectType.valueOf(tourObj.getLectType()).value)/50; //calculating carbonfootprint depending on the lect type
			int foodcarbon = foodType.carbon_footprint + (foodType.carbon_footprint*foodType.valueOf(tourObj.getFoodType()).value)/100;
			int visiteffort = visitingOptions.effort + (visitingOptions.valueOf(tourObj.getVistingOption()).value)/100; //calculating effort depending on the building type
			int lecteffort = lectType.effort + (lectType.effort*lectType.valueOf(tourObj.getLectType()).value)/50;
			int foodeffort = foodType.effort+ (foodType.effort*foodType.valueOf(tourObj.getFoodType()).value)/100;
			

            cal.printmethod();
			cal.calculateTotalCost(foodCost,visitingCost,lectureCost);
			cal.calculateTotalDuration(visitduration,lectduration,pickingGift,foodduration);
			cal.calculateCarbonfootprint(visitcarbon,lectcarbon,pickingGift,foodcarbon);
			cal.calculateEffort(visiteffort,lecteffort,pickingGift,foodeffort);
	}
}