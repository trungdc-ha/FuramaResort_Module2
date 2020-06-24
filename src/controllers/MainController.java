package controllers;

import views.*;

import java.util.Scanner;

public class MainController {
    public static void processMain(){
        try{
            Menu.displayMainMenu();
            processMainMenu();
        }catch (Exception e){
            //getBackMainMenu();
            processMain();
            System.out.println("Error");
        }
    }

    public static void processMainMenu(){
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()){
            case "1":
                Menu.menuAddNewServices();
                break;
            case "2":
                Menu.menuShowServices();
                break;
            case "3":
                CustomerController.addNewCustomer();
                break;
            case "4":
                CustomerController.showInformationCustomers();
                break;
            case "5":
                BookingController.addnewBooking();
                break;
            case "6":
                EmployeeController.showEmployeesInfo();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly !");
                processMain();
                break;
        }
    }
}
