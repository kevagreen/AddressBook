package com.tts.addressBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int choice = chooseAddressBookAction();
       HomeAddress address1 = new HomeAddress();

        switch(choice){
            case 1 -> address1.addAddress();
            case 2 -> address1.deleteAddressEntry();
            case 3 -> address1.searchAddress();
            case 4 -> address1.printAddressBook();
            case 5 -> address1.deleteEntireAddressBook();
            case 6 -> address1.quitProgram();
        }

    }

    public static int chooseAddressBookAction() {
       Scanner userChoice = new Scanner(System.in);
       int choice = -1;
        do {
            System.out.println("Please choose what you'd like to do today! \n");
            System.out.printf(" 1)Add an entry. %n 2)Remove an entry. %n 3)Search for an entry." +
                    " %n 4)Print Address Book. %n 5)Delete Book. %n 6)Quit. %n");
            System.out.printf("%n>>> ");
           choice = userChoice.nextInt();
           return choice;
        } while (userChoice.nextInt() != 6);
    }
}
