package io.zipcoder.polymorphism.IO;

public class Console {

    public static void welcomeScreen(){
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
                "******************************************************\n");
    }





}
