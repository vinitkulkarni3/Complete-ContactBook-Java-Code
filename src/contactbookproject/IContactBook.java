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
public interface IContactBook {
    
    public void addContact();
    public void deleteContact();
    public void editContact();
    public void displayContact();
    public void sortByFName();
    public void sortByZip();
    public void addContactToFile();
    
}
