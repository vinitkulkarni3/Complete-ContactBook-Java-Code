/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactbookproject;

/**
 *
 * @author Vinit
 */
public class Contact {
    
    String fname;
    String lname;
    String address;
    String city;
    String state;
    int zip;
    String phoneNumber;

    public Contact(String fname, String lname, String address, String city, String state, int zip, String phoneNumber) 
    {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }
    
    
   public String getfName() {
      return fname;
   }

   public void setfName(String fname) {
      this.fname = fname;
   }
   
    public String getlName() {
      return lname;
   }

   public void setlName(String lname) {
      this.lname = lname;
   }
   
   public String getaddress() {
      return address;
   }

   public void setaddress(String address) {
      this.address = address;
   }
   
   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }
   
   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }
   
   
   public int getZip() {
      return zip;
   }

   public void setZip(int zip) {
      this.zip = zip;
   }
   
   
   public String getphone() {
      return phoneNumber;
   }

   public void setphone(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   
   
   @Override
   public String toString() {
      return "{" +
      "fname = '" + fname + '\'' +
      ", lname = '" + lname + '\''+
      ", address = '" +address+ '\''+
      ", city = '" + city + '\''+
      ", state = '" +state+ '\''+
      ", zip = '" +zip+ '\''+
      ", phoneNumber = '" +phoneNumber+ '\''+
      '}';
   }
    
}
