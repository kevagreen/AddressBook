package com.tts.addressBook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HomeAddress implements IAddress {
    private String firstName = "";
    private String lastName = "";
    private Long phoneNumber;
    private String email = "";
    private List<HomeAddress> AddressBook  = new ArrayList<>();

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
            AddressBook.add(address);
            System.out.println("Your entry has been added to the address book! Thank you! ");
        }
        catch(InputMismatchException e){
            System.out.printf("Wrong Input %n" + e + "%n");
        }
    }

    @Override
    public void deleteAddressEntry() {
        System.out.println("deleting address");
    }

    @Override
    public void searchAddress() {

    }

    @Override
    public void deleteEntireAddressBook() {

    }

    @Override
    public void printAddressBook() {
        for(HomeAddress address: AddressBook)
        System.out.println(address);
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
                ", AddressBook=" + AddressBook +
                '}';
    }
}
