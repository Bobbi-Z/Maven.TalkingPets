package io.zipcoder.polymorphism.IO;

import io.zipcoder.polymorphism.Pets.PetsServices;
import static io.zipcoder.polymorphism.IO.Console.*;
import static io.zipcoder.polymorphism.IO.UserInput.*;

public class MainApplication {
    public static void main(String[] args)   {
        MainApplication petsApp = new MainApplication();
        petsApp.init();

    }

    public void init()   {
//        PetsServices.readJSON();
        welcome();
    }


    public void welcome()   {
        welcomeScreen();
        mainMenu();
    }

    public static void mainMenu()   {
        mainMenuDisplay();
        switch (numberInput()){
            case 1:
                addAPet();
                break;
            case 2:
                removeAPet();
                break;
            case 3:
                seeAllPets();
                whatsNext();
                break;
            case 4:
                exit();
                break;
            default:
                notAValidChoice();
                mainMenu();
        }
    }

    private static void seeAllPets() {
        System.out.println(PetsServices.getPetList());
    }

    private static void removeAPet() {
        seeAllPets();
        System.out.println("Please select the type of pet you want to delete and enter their name.");
        PetsServices.delete(UserInput.petSpecies(numberInput()), UserInput.petName());
    }

    public static void addAPet()   {
        petSelection(UserInput.petSpecies(numberInput()));
        whatsNext();
    }



    public static void petSelection(String petSpecies)   {
        switch(petSpecies) {
            case "dog": //Dog
                PetsServices.addToList(petInfo(petSpecies));
                break;
            case "cat": //Cat
                PetsServices.addToList(petInfo(petSpecies));
                break;
            case "unicorn": //Unicorn
                PetsServices.addToList(petInfo(petSpecies));
                break;
        }
    }

    public static void notAValidChoice(){
        System.out.println("That is not a valid choice! Please choose again.");
    }

public static void whatsNext()   {
    System.out.println("To return to the main menu enter 1 or to exit enter 0.");
    switch (numberInput()){
        case 0:
            exit();
            break;
        case 1:
            mainMenu();
            break;
        default:
            notAValidChoice();
            whatsNext();
    }
}

    public static void exit(){
        System.out.println("GoodBye!");
        System.exit(0);
    }

}