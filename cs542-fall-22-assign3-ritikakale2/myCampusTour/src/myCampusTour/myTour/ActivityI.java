package myCampusTour.myTour;

public interface ActivityI extends CarbonFootprintI, CostI, DurationI, EffortI{

              public void printmethod();             // Parent activity interface for extending all other activities
}