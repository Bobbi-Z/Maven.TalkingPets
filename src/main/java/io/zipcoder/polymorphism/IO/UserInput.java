package io.zipcoder.polymorphism.IO;

import io.zipcoder.polymorphism.Pets.*;
import java.util.Scanner;
import static io.zipcoder.polymorphism.IO.Console.petMenu;
import static io.zipcoder.polymorphism.IO.MainApplication.*;

public class UserInput {


    public static int numberInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String stringInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String petSpecies(){
        petMenu();
        int speciesSelection = numberInput();
        switch (speciesSelection){
            case 1:
                return "dog";
            case 2:
                return "cat";
            case 3:
                return "unicorn";
            case 4:
                exit();
                return "GoodBye!";
            default:
                notAValidChoice();
                return "Please choose again.";
        }
    }


    public static Pets petInfo(String petSpecies)   {
        System.out.println("Please enter your " + petSpecies + "'s information:");
        String name = petName();
        String color = petColor();
        return PetsServices.whatPetToCreate(petSpecies, name, color);
    }

    public static String petName(){
        System.out.println("Name: ");
        return stringInput();
    }

    public static String petColor(){
        System.out.println("Color: ");
        return stringInput();
    }

}