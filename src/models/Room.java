package models;

public class Room extends Services {
    private ExtraService extraService;

    public Room(String id, String serviceName, double areaUse, double rentCost, int numberOfPeoples, String typeRent, ExtraService extraService) {
        super(id, serviceName, areaUse, rentCost, numberOfPeoples, typeRent);
        this.extraService = extraService;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}' + super.toString();
    }
}
