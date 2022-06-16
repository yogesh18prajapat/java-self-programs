package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobile = new MobilePhone("9955999444");


    public static void main(String[] ags) {


        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.print("Enter your Action : ( press 0 to print available options )");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    printActions();
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void startPhone(){
        System.out.println("Starting phone");
    }

    public static void addNewContact(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phoneNumber);
        if(mobile.addNewContact(newContact)){
            System.out.println("added new contact "+name+"->"+phoneNumber);
        }else{
            System.out.println("can't add , already on file");
        }
    }


    public static void updateContact(){
        System.out.print("enter existing name: ");
        String existingName = scanner.nextLine();
        Contacts oldContact = mobile.queryContact(existingName);
        if(oldContact != null){
            System.out.print("enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            Contacts newContact = Contacts.createContact(newName,newPhoneNumber);
            mobile.updateContact(oldContact,newContact);

        }else {
            System.out.println("error updating");
        }
    }
    public static void deleteContact(){
        System.out.println("enter existing name: ");
        String existingName = scanner.nextLine();
        Contacts oldContact = mobile.queryContact(existingName);
        if(oldContact != null){
            mobile.removeContact(oldContact);
        }else {
            System.out.println("error deleting");
        }
    }
    public static void searchContact(){
        System.out.println("enter existing name: ");
        String existingName = scanner.nextLine();
        Contacts oldContact = mobile.queryContact(existingName);
        if(oldContact != null){
            System.out.println("contact: "+oldContact.getName()+" -> "+oldContact.getPhoneNumber());
        }else {
            System.out.println("contact doesn't exist");
        }

    }
    public static void printActions(){
        System.out.println("\n Available actions : \n press");
        System.out.println("\t 0 - To print available actions");
        System.out.println("\t 1 - To print contact");
        System.out.println("\t 2 - To add contact");
        System.out.println("\t 3 - To update existing  contact");
        System.out.println("\t 4 - To delete an existing  contact");
        System.out.println("\t 5 - to query existing contact");
        System.out.println("\t 6 - To quit application");
    }

}
