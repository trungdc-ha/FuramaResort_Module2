package models;

public class Villa extends Services {
    private String standardRoom;
    private String otherDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa(String id, String serviceName, double areaUse, double rentCost, int numberOfPeoples, String typeRent, String standardRoom, String otherDescription, double areaPool, int numberOfFloors) {
        super(id, serviceName, areaUse, rentCost, numberOfPeoples, typeRent);
        this.standardRoom = standardRoom;
        this.otherDescription = otherDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {
        super();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherDescription='" + otherDescription + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
                '}' + super.toString();
    }
}
