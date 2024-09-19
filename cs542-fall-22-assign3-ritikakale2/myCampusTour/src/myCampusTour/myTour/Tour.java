package myCampusTour.myTour;

public class Tour{
String building;
	String lectType;
	String foodType;
    String giftLocation;
    String visitingOption;
	
	public Tour(String building, String visitingOption, String lectType, String giftLocation, String foodType) {
		super();
		this.building = building;
		this.lectType = lectType;
		this.foodType = foodType;
        this.giftLocation = giftLocation;
        this.visitingOption = visitingOption;

	}
	
	public String getBuilding() {
		return building;
	}
	public String getLectType() {
		return lectType;
	}
	public String getFoodType() {
		return foodType;
	}
    public String getVistingOption()
    {
        return visitingOption;
    }
    public String getGiftLocation()
    {
        return giftLocation;
    }
}