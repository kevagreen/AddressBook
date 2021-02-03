package com.tts.addressBook;

import java.util.*;


public class HomeAddress implements IAddress {
    private String firstName = "";
    private String lastName = "";
    private Long phoneNumber;
    private String email = "";
    private final List<HomeAddress> addressBook = new ArrayList<>();

    //main constructor
    public HomeAddress(String firstName, String lastName, Long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public HomeAddress() {
    }

    public HomeAddress(HomeAddress address) {
    }


    @Override
    public void addAddress(HomeAddress address) {
        Scanner addEntry = new Scanner(System.in);
        try {
            System.out.print("First Name: ");
            firstName = addEntry.next();
            System.out.print("Last Name: ");
            lastName = addEntry.next();
            System.out.print("Phone Number: ");
            phoneNumber = addEntry.nextLong();
            System.out.print("Email: ");
            email = addEntry.next();
            address = new HomeAddress(firstName, lastName, phoneNumber, email);
            addressBook.add(address);
            System.out.printf("%nYour entry has been added to the address book! Thank you! %n");
        } catch (InputMismatchException e) {
            System.out.printf("Incorrect Input. Please Try again! %n" + e + "%n");
        }
    }

    @Override
    public void deleteAddressEntry() {
        if (addressBook.isEmpty()) System.out.printf("\nAddress Book is empty! %n");
        else System.out.printf("%n What entry do you want to remove? %n %n >>> ");
        Scanner deleteIndex = new Scanner(System.in);
        System.out.printf("%nEntry removed: %n" + addressBook.remove(deleteIndex.nextInt()));
    }

    @Override
    public void searchAddress() {
        Scanner search = new Scanner(System.in);
        if (addressBook.isEmpty()) System.out.printf("\nAddress Book is empty! %n");
        System.out.printf("Search By: %n 1)First Name. %n 2)Last Name. %n 3)Phone Number.%n 4)Email. %n>>>  ");
        int choice = search.nextInt();
        if (choice > 0 && choice <= 4) System.out.println("Enter Search Info");
        String result = search.next();
        //
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.contains(result)) System.out.println(addressBook.get(i));
        }
    }

    @Override
    public void deleteEntireAddressBook() {
        if (addressBook.isEmpty()) System.out.printf("\nAddress Book is empty! %n");
        else System.out.printf("%n Do you want to delete the ENTIRE address book? %n>>> ");
        Scanner deleteBook = new Scanner(System.in);
        String answer = deleteBook.next();
        if (answer.equals("yes")) addressBook.clear();
        System.out.printf("%n You deleted the entire address book! %n");
    }

    @Override
    public void printAddressBook() {
        if (addressBook.isEmpty()) System.out.printf("\nAddress Book is empty! %n");
        for (HomeAddress address : addressBook) System.out.println(address);
    }

    @Override
    public void quitProgram() {
        System.out.println("Thanks! Until next time, goodbye!");
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", AddressBook=" + addressBook +
                '}';
    }
}
