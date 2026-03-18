import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner input = new Scanner(System.in);

        String firstAdjecString;
        String secondAdjectiveString;
        String thirdAdjectiveString;
        String firstNounString;
        String firstVerbString;

        System.out.println("Welcome to the MAD LIBS game!");

        System.out.println("Please enter an adjective: ");
        firstAdjecString = input.nextLine();
        
        System.out.println("Please enter a noun: ");
        firstNounString = input.nextLine();
        
        System.out.println("Please enter another adjective: ");
        secondAdjectiveString = input.nextLine();

        System.out.println("Please enter a third adjective: ");
        thirdAdjectiveString = input.nextLine();

        
        System.out.println("Please enter a verb: ");
        firstVerbString = input.nextLine();

        System.out.println("\nToday I went to a " + firstAdjecString + " zoo.");
        System.out.println("In an exhibit, I saw a " + firstNounString + ".");
        System.out.println(firstNounString + " was " + secondAdjectiveString + " and " + firstVerbString + "!");
        System.out.println("I was " + thirdAdjectiveString + "!");

        input.close();                  

    }    
}