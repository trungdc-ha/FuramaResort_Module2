package models;

public class Employee {
    private String id;
    private String name;
    private String birthday;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String educationLevel;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String birthday, String idCard, String phoneNumber, String email, String educationLevel, String position, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n*********** Employee ***********" +
                "\nName: " + name +
                "\nBirthday: " + birthday +
                "\nIdCard: " + idCard +
                "\nPhoneNumber: " + phoneNumber +
                "\nEmail: " + email +
                "\nEducation Level: " + educationLevel +
                "\nPosition: " + position +
                "\nSalary: " + salary;
    }
}
