package com.tts.addressBook;


public interface IAddress {
    void addAddress(HomeAddress address);

    void deleteAddressEntry();

    void searchAddress();

    void printAddressBook();

    void deleteEntireAddressBook();

    void quitProgram();
}
