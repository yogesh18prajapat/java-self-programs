package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String number;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String number) {
        this.number = number;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact name already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundContact = findContact(oldContact);
        if (foundContact < 0) {
            System.out.println(newContact.getName() + " was not found");
            return false;
        }else if(findContact(newContact.getName()) != -1){
            System.out.println("contact name with '"+newContact.getName()+"' already exists, updating unsuccessful");
            return false;
        }
        this.myContacts.set(foundContact, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        if (findContact(contact.getName()) < 0) {
            System.out.println(contact.getName() + " not found");
            return false;
        }
        this.myContacts.remove(contact);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if (findContact(contact) > 0) {
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String contactName) {
        int position = findContact(contactName);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }



    public  void printContacts(){
        System.out.println("contact list");
        for(int i=0; i<this.myContacts.size();i++){
            System.out.println((i+1)+"."+myContacts.get(i).getName()+"->"+myContacts.get(i).getPhoneNumber());
        }
    }

}
