package myCampusTour.driver;
import myCampusTour.myTour.*;


public class Calculate implements ActivityI{

    public void printmethod(){
        System.out.println("Calculation for each activity");
    }

    public void calculateCarbonfootprint(int visitingOptions,int lectType, int pickingGiftLocation, int foodType)
    {
       System.out.println("Carbon footprint in terms of CO2 : "+(visitingOptions + lectType + pickingGiftLocation + foodType)+ " CO2");
    }

    public void calculateTotalCost(int foodCost, int visitingCost, int lectureCost)
    {
             System.out.println("Cost : "+(foodCost + visitingCost + lectureCost) + "$");
    }

    public void calculateTotalDuration(int visitingOptions,int lectType, int pickingGiftLocation, int foodType){
          System.out.println("Duration : "+(visitingOptions + lectType + pickingGiftLocation + foodType)+ " min");
    }

    public void calculateEffort(int visitingOptions,int lectType, int pickingGiftLocation, int foodType){
           System.out.println("Effort : "+(visitingOptions + lectType + pickingGiftLocation + foodType)+ " Calories");
    }

}