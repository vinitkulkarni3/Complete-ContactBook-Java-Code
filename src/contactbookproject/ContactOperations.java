/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactbookproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author Vinit
 */
public class ContactOperations implements IContactBook{
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    Iterator itr=contactList.iterator();

    @Override
    public void addContact() {
                        
        System.out.print("Enter first name : ");
        String fname = sc.next();
        
        System.out.print("Enter last name : ");
        String lname = sc.next();
        
        System.out.print("Enter address : ");
        String address = sc.next();
        
        System.out.print("Enter city : ");
        String city = sc.next();
        
        System.out.print("Enter state name : ");
        String state = sc.next();
        
        System.out.print("Enter zip : ");
        int zip = sc.nextInt();
        
        System.out.print("Enter phone : ");
        String phone = sc.next();
        String s=String.valueOf(phone);
                        
        Contact c = new Contact(fname, lname, address, city, state, zip, phone);
        contactList.add(c);
                     
    }

    @Override
    public void deleteContact() {
        
        System.out.print("Enter contact index : ");
        int index = sc.nextInt();
                        
        contactList.remove(index);
    }

    @Override
    public void editContact() {
        
        System.out.print("Enter Contact Index: ");
        int ind = sc.nextInt();
        System.out.println("1.Lname  2.address  3.city  4.state  5.zip 6.phoneNumber");
        System.out.print("Select the which filed you want to change:");
        int opt = sc.nextInt();
                               
        if(opt == 1 )
        {
            System.out.print("Enter the value: ");
            String value = sc.next();
            //last name modification
            contactList.get(ind).setlName(value);
        }
        else if(opt == 2)
        {
            System.out.print("Enter the value: ");
            String value = sc.next();
            //address modification
            contactList.get(ind).setaddress(value);
        }
        else if(opt == 3)
        {
            System.out.print("Enter the value: ");
            String value = sc.next();
            //city name modification
            contactList.get(ind).setCity(value);
        }
        else if(opt == 4)
        {
            System.out.print("Enter the value: ");
            String value = sc.next();
            //state name modification
            contactList.get(ind).setState(value);
        }
        else if(opt == 5)
        {
            System.out.print("Enter the value: ");
            int value = sc.nextInt();
            //zip modification
            contactList.get(ind).setZip(value);
        }
        else if(opt == 6)
        {
            System.out.print("Enter the value: ");
            String value = sc.next();
            //phone number modification
            contactList.get(ind).setphone(value);
        }
        else
        {
            System.out.println("Error");
        }
        
        System.out.println("UPDATED");
    }

    @Override
    public void displayContact() {
                        
        int r=0;//contact index
        System.out.println("---------------------------");
        
        for(Iterator<Contact> itr = contactList.iterator(); itr.hasNext();)
        { 
            System.out.print("contact number: "+ r++ +" --> ");
            Contact stt = (Contact)itr.next();
            System.out.println(stt.fname+" "+stt.lname+" "+stt.address+" "+" "+stt.zip+" "+stt.phoneNumber);
        }
        
        System.out.println("---------------------------");

    }

    @Override
    public void sortByFName() {
        
        System.out.println("Sorted Successfully");
        contactList.sort(Comparator.comparing(Contact::getfName));
    }

    @Override
    public void sortByZip() {
        
        System.out.println("Sorted Sucessfully");
        contactList.sort(Comparator.comparingInt(Contact::getZip));
    }

    @Override
    public void addContactToFile() {
        
        try
        {
            FileWriter writer = new FileWriter("ContactBook.txt"); 
            for(Contact cList: contactList) 
            {
                writer.write(cList + System.lineSeparator());
            }
            writer.close();
            System.out.println("Data Inserted Succesfull in 'ContactBook.txt' File");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
