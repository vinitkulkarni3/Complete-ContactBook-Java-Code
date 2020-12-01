/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactbookproject;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vinit
 */
public class ContactBookTest {
    
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    Iterator itr=contactList.iterator();
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ContactOperations co = new ContactOperations();
        
        int n=1;
        while(n>0)
        {
            System.out.println("1.Add  2.Delete  3.Display  4.Edit  5.Sort By FName  6.Sort By Zip  7.Add Into File  8.Exit");
            System.out.print("Enter the Choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: co.addContact();
                    break;
                    
                case 2: co.deleteContact();
                    break;
                    
                case 3: co.displayContact();
                    break;
                    
                case 4: co.editContact();
                    break;
                    
                case 5: co.sortByFName();
                    break;
                    
                case 6: co.sortByZip();
                    break;
                    
                case 7: co.addContactToFile();
                    break;
                    
                case 8: System.out.println("Exited");
                        exit(0);
                        break;
                        
                default:System.out.println("Invalid Option");
                    break;
            }
        }   
    } 
}
