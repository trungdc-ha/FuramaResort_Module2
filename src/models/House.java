package models;

public class House extends Services {
    private String standardRoom;
    private String otherDescription;
    private int numberOfFloors;

    public House(String id, String serviceName, double areaUse, double rentCost, int numberOfPeoples, String typeRent, String standardRoom, String otherDescription, int numberOfFloors) {
        super(id, serviceName, areaUse, rentCost, numberOfPeoples, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}' + toString();
    }
}
