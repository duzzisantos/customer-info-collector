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
//class for the Business customer extending the Customer class
public class UcheAbbaBusinessCustomer extends UcheAbbaCustomer{

    private String contactPerson;
     public UcheAbbaBusinessCustomer(String customerID, String streetAddress, String city, String state, String zip, String email, String contact){
        super(); //the super method ensures that we can reuse the properties in the super class.
        this.customerID = customerID;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        contactPerson = contact;
        this.accounts = new UcheAbbaAccount[10];
    }
    public void setContactPerson(String person){ // this sets information for the contact person.
        contactPerson = person;
    }
    
    public String getContactPerson(){ //this is a getter for the contact person
        return contactPerson;
    }
    
    public void addAccount(UcheAbbaAccount account) {
    // Add the account to the customer's list of accounts
    //add account information into the customers lists of account information on the first available empty slot
    for(int i = 0; i < accounts.length; i++) { //this appends account information to the account list
        if(accounts[i] == null) {
            accounts[i] = account;
            break;
        }
    }
    }
    
    @Override
    public String toString(){ //override string method helps us to customise the way our values are printed when returned. The method is suppoised to print a stringed output which is reusable.
        return(
         contactPerson + "\n" 
                + super.toString()
        );
    }
}
