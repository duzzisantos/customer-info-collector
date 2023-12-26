/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucheabbaproject2;

/**
 *
 * @author Duzie Uche-Abba
 * @version 1.0
 * @dateCreated 15.04.2023
 * @description This project creates an application that collects and prints data for certain types of customers, for example retail (B2C) and business (B2B) customers. These data will
 * be generated with the utilization of get and set methods.
 */
import java.util.Scanner;

//This is the class for the main method, where tests are carried out on the requirements of the application
public class UcheAbbaTest {
    //main method is where the main functionality of the app is carried out to test if the classes were well implemented.
  public static void main(String[] args) {
      // scanner collects input details which ware assigned to the new objects prototypes created
        Scanner scanner = new Scanner(System.in);

        // Create four Account objects whose arguments contain a string and a class 
        UcheAbbaAccount account1 = new UcheAbbaAccount("001", null);
        UcheAbbaAccount account2 = new UcheAbbaAccount("002", null);
        UcheAbbaAccount account3 = new UcheAbbaAccount("003", null);
        UcheAbbaAccount account4 = new UcheAbbaAccount("004", null);

        // Create a retail customer and assign two accounts to it
        System.out.println("Please enter information for the retail customer:");
        System.out.println("Enter First Name: ");
        String retailFirstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String retailLastName = scanner.nextLine();
        System.out.println("Enter Customer ID: ");
        String retailCustomerID = scanner.nextLine();
        System.out.println("Enter Street Address: ");
        String retailStreetAddress = scanner.nextLine();
        System.out.println("Enter City: ");
        String retailCity = scanner.nextLine();
        System.out.println("Enter State: ");
        String retailState = scanner.nextLine();
        System.out.println("Enter Zip: ");
        String retailZip = scanner.nextLine();
        System.out.println("Enter Email: ");
        String retailEmail = scanner.nextLine();
        
        //create a retail customer object with which we can create accounts which will be appended to the account list
        UcheAbbaRetailCustomer retailCustomer = new UcheAbbaRetailCustomer(retailCustomerID, retailStreetAddress, retailCity, retailState, retailZip, retailEmail, retailFirstName, retailLastName);
        retailCustomer.addAccount(account1);
        retailCustomer.addAccount(account2);
        
        

        // Create a business customer and assign two accounts to it
        System.out.println("\nPlease enter information for the business customer:");
        System.out.println("Enter Contact Person: ");
        String businessContactPerson = scanner.nextLine();
        System.out.println("Enter Customer ID: ");
        String businessCustomerID = scanner.nextLine();
        System.out.println("Enter Street Address: ");
        String businessStreetAddress = scanner.nextLine();
        System.out.println("Enter City: ");
        String businessCity = scanner.nextLine();
        System.out.println("Enter State: ");
        String businessState = scanner.nextLine();
        System.out.println("Enter Zip: ");
        String businessZip = scanner.nextLine();
        System.out.println("Enter Email: ");
        String businessEmail = scanner.nextLine();
        
        //create a business customer object with which accounts 3 and 4 can be appended to the account list
        UcheAbbaBusinessCustomer businessCustomer = new UcheAbbaBusinessCustomer(businessContactPerson, businessCustomerID, businessStreetAddress, businessCity, businessState, businessZip, businessEmail);
        businessCustomer.addAccount(account3);
        businessCustomer.addAccount(account4);
      
        //This section prints the output without the label since they are not required.
        System.out.println("RETAIL CUSTOMER: ");
        System.out.println("");
        System.out.println(retailCustomer.toString());
        System.out.println("BUSINESS CUSTOMER: ");
        System.out.println("");
        System.out.println(businessCustomer.toString());
    }

}