
package testtitanic;
/*
 * File: TestTitanic.java
 * Author: Brock A. Allton
 * Date: 21 July 2016
 * Purpose: To run and test the Titanic Object
 */


import java.time.Instant;
import java.util.Scanner;


public class TestTitanic {

    public static void main(String[] argv){
        String choice;
        boolean loop = true;
        Scanner scannerIn = new Scanner(System.in);
        
        // Gets time at start of program 
        Instant start = Instant.now();
        
        Titanic passenger = new Titanic(argv);
        
        System.out.println ("********Welcome to the Titanic Statistical "
                + "Application********");
        
        while (loop == true){
        System.out.println("Enter the number of the question you want "
                + "answered."
                + " Enter 'Q' to quit the program:\n"
                + "1. How many passengers were on Titanic?\n"
                + "2. What percentage of passengers perished on Titanic?\n"
                + "3. What percentage of passengers survived the sinking of "
                + " Titanic?\n"
                + "4. What percentage of 1st Class passengers perished?\n"
                + "5. What percentage of 2nd Class passengers perished?\n"
                + "6. What percentage of 3rd Class passengers perished?\n"
                + "7. What passengers who were 10 years old "
                + "perished on Titanic?\n"
                + "8. What percentage of passengers who were female survived?\n"
                + "9. List number of passengers on Titanic by first letter of"
                + "last name."
                + "Q. Quit the program\n\n" + "Enter your selection: ");
        
        choice = scannerIn.nextLine();
        switch (choice){
            case "1": passenger.getPassNum();
                break;
            case "2": System.out.println("The percent of passengers who "
                    + "perished on Titanic was:"
                    + " " + passenger.getPerishedPrcnt() + "%\n");
                break;
            case "3": System.out.println("The percent of passengers who "
                    + " survived on Titanic was: "
                    + passenger.getPrcntSurvived() + "%\n");
                break;
            case "4": System.out.println("The percentage of 1st Class"
                    + " passengers who perished on Titanic was: "
                    + passenger.getFirstClassPassDied() + "%\n");
                break;
            case "5": System.out.println("The percentage of 2nd Class"
                    + " passengers who perished on Titanic was: " + 
                    passenger.getSecondClassPassDied() + "&\n");
                break;
            case "6": System.out.println("The percentage of 3rd Class"
                    + " passengers who perished on Titanic was: " +
                    passenger.getThirdClassPassWhoDied() + "%\n");
                break;
            case "7": System.out.println("The percentage of passengers who"
                    + " were 10 that perished on Titanic was: " 
                    + passenger.getAgeDied() + "%\n");
                break;
            case "8": System.out.println("The percent of passengers who survived"
                    + " on Titanic that were female was: " 
                    + passenger.getFemaleSurvived() + "%\n");                    
                break;
            case "9": passenger.getLastName();
            case "Q": System.out.println ("Thank you for trying the Titanic"
                    + " program!");
                loop = false;
                break;
            default: System.out.println ("Not a valid option, please enter"
                    + " 1-9 or Q for your choice.\n");
        }
       }
       Instant after = Instant.now();
       long startTime = System.currentTimeMillis();
       
       long total = 0;
       for (int i = 0; i < 10000000; i++){
           total += i;
       }
       long stopTime = System.currentTimeMillis();
       long elapsedTime = stopTime - startTime;
       System.out.println ("Elapsed Time: " + elapsedTime);
    }
    
}
