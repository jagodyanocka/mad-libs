package madlibs;

import java.util.Scanner;

// Create program that ask a user for a season of the year then a whole number than a adjective and use
// the input to complete the sentence and then output the result "On a [adjective] [season of the year] day
// I drink minimum of [whole number] cups of coffee.
public class SentenceCreator {
    public static void main(String[] args) {
//  1. Ask for entering the season
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

//  2. Enter the whole number
        System.out.println("Enter the whole number");
        int number = scanner.nextInt();

//  3. Enter an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

//  4. Display the sentence
        System.out.println("On a " + adjective + " " + season + " day of the year I drink a minimum of " + number +
        " cups of coffee");

    }


}
