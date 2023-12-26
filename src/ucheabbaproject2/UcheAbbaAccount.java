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

//The account class with which an account list can be created
public class UcheAbbaAccount {
    private String accountID;
    private UcheAbbaCustomer customer;
    
    //the class' constructor
    public UcheAbbaAccount(String accountID, UcheAbbaCustomer customer) {
        this.accountID = accountID;
        this.customer = customer;
    }
    
    public void setAccountID(String accountID) { //the setter for the account ID
        this.accountID = accountID;
    }
    
    public void setCustomer(UcheAbbaCustomer customer) { //the setter for customer information
        this.customer = customer;
    }
    
    public String getAccountID() { //the getter for account ID
        return accountID;
    }
    
    public UcheAbbaCustomer getCustomer() { //the getter for customer information
        return customer;
    }
    
    @Override
    public String toString() { //override string method helps us to customise the way our values are printed when returned. The method is suppoised to print a stringed output which is reusable.
        return "Account ID: " + accountID + "\n" + customer.toString();
    }
}