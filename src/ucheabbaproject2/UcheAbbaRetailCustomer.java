/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
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

//class for the Retail customer extending the customer class for inheritance
public class UcheAbbaRetailCustomer extends UcheAbbaCustomer {
    private String firstName;
    private String lastName;
  

    public UcheAbbaRetailCustomer(String customerID, String streetAddress, String city, String state, String zip, String email, String firstName, String lastName) {
        super(); //super refrences the properties from the parent class, to promote reusability of properties within the sub-class.
        this.customerID = customerID;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new UcheAbbaAccount[10];
      
        
        
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) { // This method sets the user first name
        this.firstName = firstName;
    }

    public String getFirstName() { //This method references the user first name
        return firstName;
    }

    public void setLastName(String lastName) { // This method sets the user last name
        this.lastName = lastName; 
    }

    public String getLastName() { // This references the user last name
        return lastName;
    }

    public void addAccount(UcheAbbaAccount account) { //This adds accounts to the account list
    // Add the account to the customer's list of accounts
    //add account information into the customers lists of account information on the first available empty slot
    for(int i = 0; i < accounts.length; i++) {
        if(accounts[i] == null) {
            accounts[i] = account;
            break;
        }
    }
}

    @Override
    public String toString() {
//       System.out.println("Before checking array: ");
//       int length = accounts.length;
//       System.out.println(length);
//       System.out.println("After checking array: ");
//       if(length < 1){
//           System.out.println(length);
//       } 
       return firstName + " " + lastName + "\n" + super.toString();
    }
}