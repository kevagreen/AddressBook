package com.tts.addressBook;

import java.util.List;

public interface IAddress {
    void addAddress(HomeAddress address);

    void deleteAddressEntry();

    void searchAddress();

    void printAddressBook();

    void deleteEntireAddressBook();

    void quitProgram();
}
