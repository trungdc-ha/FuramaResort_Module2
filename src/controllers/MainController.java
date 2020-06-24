package controllers;

import commons.FileUtils;
import models.Room;
import models.Services;
import models.Villa;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExist;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static boolean isBackToMenu;

    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExist\n");
            System.out.print("Please choose (1 - 6): ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    isExist = true;
            }
        } while (!isExist);
    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
        int choose = 0;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.print("Please choose service to add: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showAllServiceNotDup(VILLA);
                    isBackToMenu = true;
                    break;
                case 5:
                    showAllServiceNotDup(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showAllServiceNotDup(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
                case 8:
                    isExist = true;
                    break;
            }
            if (isBackToMenu || isExist) {
                return;
            }
        } while (choose >= 1 && choose <= 5);
    }

    public static List<Services> readAllServices(String fileName){
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Services> servicesList = new ArrayList<>();

        String services = null;
        for(String properties: propertiesService){
            if(VILLA.equals(fileName)){
                //services = new Villa();
            }
        }
        return servicesList;
    }
    private static void showAllServiceNotDup(String fileName) {
    }

    private static void showAllService(String fileName) {

    }

    private static void addNewServices() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.print("Please choose service to add: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    break;
                case 2:
                    addNewService(HOUSE);
                    break;
                case 3:
                    addNewService(ROOM);
                    break;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    isExist = true;
                    break;
            }
            if (isBackToMenu || isExist) {
                return;
            }
        } while (choose >= 1 && choose <= 5);
    }

    private static void addNewService(String serviceType) {
        System.out.print("Please input service id: ");
        String id = scanner.nextLine();
        System.out.print("Please input service name: ");
        String serviceName = scanner.nextLine();
        System.out.print("Please input area use: ");
        double areUse = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input rent cost: ");
        double rentCost = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input number of people: ");
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("Please input type rent: ");
        String typeRent = scanner.nextLine();

        FileUtils.setFullPathFile(serviceType);
        if (VILLA.equals(serviceType)) {
            System.out.print("Please input standard room: ");
            String standardRoom = scanner.nextLine();
            System.out.print("Please input other description: ");
            String otherDescription = scanner.nextLine();
            System.out.print("Please input area pool: ");
            double areaPool = Double.parseDouble(scanner.nextLine());
            System.out.print("Please input number of floors: ");
            int numberOfFloors = Integer.parseInt(scanner.nextLine());

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost),
                    String.valueOf(numberOfPeople), typeRent, standardRoom, otherDescription, String.valueOf(areaPool),
                    String.valueOf(numberOfFloors)});

        } else if (HOUSE.equals(serviceType)) {
            System.out.print("Please input standard room: ");
            String standardRoom = scanner.nextLine();
            System.out.print("Please input other description: ");
            String otherDescription = scanner.nextLine();
            System.out.print("Please input number of floors: ");
            int numberOfFloors = Integer.parseInt(scanner.nextLine());

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost),
                    String.valueOf(numberOfPeople), typeRent, standardRoom, otherDescription,
                    String.valueOf(numberOfFloors)});

        } else if (ROOM.equals(serviceType)) {
            System.out.print("Please input extra service name: ");
            String extraServiceName = scanner.nextLine();
            System.out.print("Please input unit: ");
            String unit = scanner.nextLine();
            System.out.print("Please input money: ");
            double money = Double.parseDouble(scanner.nextLine());

            FileUtils.writeFile(new String[]{id, serviceName, String.valueOf(areUse), String.valueOf(rentCost),
                    String.valueOf(numberOfPeople), typeRent, extraServiceName, unit, String.valueOf(money)});
        }

    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
