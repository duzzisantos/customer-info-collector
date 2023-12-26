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

//class for the the customer. This is the parent class upon which most of the other classes in this app depend.
public class UcheAbbaCustomer {

  //The private classes according to the plan in the UML design are stated here. With these classes, the set and get methods are possible within this class
    
  protected String customerID;
  protected String streetAddress;
  protected String city;
  protected String state;
  protected String zip;
  protected String email;
  protected UcheAbbaAccount[] accounts;
  
  
 public UcheAbbaCustomer() {
    this.accounts = new UcheAbbaAccount[2]; // or any other desired size
}
  //These methods below set the data, using a data type and assigning the private variables with the set data using void
  
  public void setCustomerID(String useID){ // this sets the customer ID
      customerID = useID;
  }
  
  public void setStreetAddress(String useStreetAddress){ // This sets the street adress of the customer
      streetAddress = useStreetAddress;
  }
  
  public void setCity(String useCity){ //This sets the city of the user
      city = useCity;
  }
  
  public void setState(String useState){ // This sets the state where the user resides in
      state = useState;
  }
  
  public void setZip(String useZip){ //This collects info about their zip code
      zip = useZip;
  }
  
  public void setEmail(String useEmail){ //This collects information regarding use email address.
      email = useEmail;
  }
  
  public void addAccount(String account) { //This adds new account instances to the array list iteratively
    for(int i = 0; i < accounts.length; i++) {
        if(accounts[i] == null) {
            accounts[i] = new UcheAbbaAccount(account, this); // pass this as the second parameter
            break;
        }
    }
}
  
  
  //These methods below obtain the data that has been set with the set methods, by returning values of identical data types with the set methods.
  
  public String getCustomerId(){ //This returns the customer ID set
      return customerID;
  }
  
  public String getStreetAddress(){ // This returns the set street address whenever we want to make reference to it
      return streetAddress;
  }
  
  public String getCity(){ //This references trhe city of the user
      return city;
  }
  
  public String getState(){ // This references the user's state
      return state;
  }
  
  public String getZip(){ //This references the user's ZIP code eg: TN 55667
      return zip;
  }
  
  public String getEmail(){ //This references the user's email address
      return email;
  }
  
  public UcheAbbaAccount[] getAccounts(){ // This obtains information about the account list 
      UcheAbbaAccount[] tempData = new UcheAbbaAccount[accounts.length];
      
      UcheAbbaAccount[] output = new UcheAbbaAccount[2];
      System.arraycopy(tempData, 0, output, 0, 2);
      return output;
  }
  
  @Override
  public String toString(){ //The overridfen string method is used to print all the attributes in the class
      
      
      //The commented out is yielding an error as some parts of the could not be implemented
      
//      StringBuilder builder = new StringBuilder();
//      for(UcheAbbaAccount account : accounts){
//          builder.append(account).append(", ");
//      }
//      
//      //this method removes the redundant ", " after the item on the last index of the array
//      builder.delete(builder.length() - 2, builder.length());
      return (
       customerID + "\n"
       + streetAddress + "\n"
       + city + "\n"
       + state + "\n"
       + zip + "\n"
       + email + "\n"
//       + builder.toString() + "\n"
      );
  }
}
