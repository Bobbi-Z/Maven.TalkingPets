package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Unicorn;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        MainApplication petsApp = new MainApplication();
        petsApp.init();

    }

    public void init(){
        welcome();
    }

    public static int numberInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String stringInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void welcomeScreen(){
        System.out.println("******************************************************\n" +
                           "***               Welcome to Pet Logger!           ***\n" +
                           "***                                                ***\n" +
                           "***  The perfect place to keep track of your pets! ***\n" +
                           "******************************************************\n");
    }

    public static void petMenu(){
        System.out.println("******************************************************\n" +
                           "***  The following Pets are currently supported:   ***\n" +
                           "***                                                ***\n" +
                           "***                   #1 Dog                       ***\n" +
                           "***                   #2 Cat                       ***\n" +
                           "***                   #3 Unicorn                   ***\n" +
                           "***                or #4 to exit                   ***\n" +
                           "***                                                ***\n" +
                           "***   Please select the number of your first pet   ***\n" +
                           "******************************************************\n");

    }

    public static void mainMenuDisplay(){
        System.out.println( "******************************************************\n" +
                            "***                Do you want to:                 ***\n" +
                            "***                                                ***\n" +
                            "***                #1 Add a pet                    ***\n" +
                            "***                #2 Remove a pet                 ***\n" +
                            "***                #3 See all pets                 ***\n" +
                            "***                or #4 to exit                   ***\n" +
                            "***                                                ***\n" +
                            "***   Please select the number of your first pet   ***\n" +
                            "******************************************************\n");
    }


    public void welcome(){
        welcomeScreen();
        mainMenu();
    }

    public static void mainMenu(){
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
        //show a list of all the pets currently
    }

    private static void removeAPet() {
        //remove a pet from the list
    }

    public static void addAPet(){
        petMenu();
        petSelection(numberInput());
    }


    public static String notAValidChoice(){
        System.out.println("That is not a valid choice! Please choose again.");
        return "That is not a valid choice! Please choose again.";
    }

    public static String petSelection(Integer numOfSelection){
        switch(numOfSelection){
            case 1: //Dog
                System.out.println(Dog.makeNoise());
                petInfo(petSelection(1));
                return "dog";
            case 2: //Cat
                System.out.println(Cat.makeNoise());
                petInfo(petSelection(2));
                return "cat";
            case 3: //Unicorn
                System.out.println(Unicorn.makeNoise());
                petInfo(petSelection(3));
                return "unicorn";
            case 4:
                exit();
                return "GoodBye!";
            default:
                addAPet();
               return notAValidChoice();
        }

    }

public static void petInfo(String petType){
    System.out.println("Please enter your " + petType + "'s information:");
    String name =  petName();
    String color = petColor();
    System.out.println("The " + petType + " you entered is " + name + " and they are " + color + ".");
    System.out.println("To return to the main menu enter 1 or to exit enter 0.");
    whatsNext();
}

public static void whatsNext(){
    switch (numberInput()){
        case 0:
            exit();
            break;
        case 1:
            mainMenu();
            break;
        default:
            notAValidChoice();
    }
}

public static String petName(){
    System.out.println("Name: ");
    return stringInput();
}

public static String petColor(){
    System.out.println("Color");
    return stringInput();
}

    public static void exit(){
        System.out.println("GoodBye!");
        System.exit(0);
    }

}
