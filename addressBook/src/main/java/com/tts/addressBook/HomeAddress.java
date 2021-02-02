package com.tts.addressBook;

import java.util.ArrayList;
import java.util.List;

public class HomeAddress implements IAddress {
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;

    //main constructor
    public HomeAddress(String firstName, String lastName, Long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public HomeAddress() {

    }


    @Override
    public void addAddress() {
        System.out.println("adding address");
    }

    @Override
    public void deleteAddressEntry() {

    }

    @Override
    public void searchAddress() {

    }

    @Override
    public void deleteEntireAddressBook() {

    }

    @Override
    public List<String> printAddressBook() {
        return new ArrayList<>();
    }

    @Override
    public void quitProgram() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
