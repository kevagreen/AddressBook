package com.tts.addressBook;

import java.util.List;

public interface IAddress {
    void addAddress();
    void deleteAddressEntry();
    void searchAddress();
    List printAddressBook();
    void deleteEntireAddressBook();
    void quitProgram();
}
