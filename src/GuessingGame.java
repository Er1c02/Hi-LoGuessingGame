//public class GuessingGame {
//}

//Listing 3.3
//********************************************************************
//  Guessing.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a block statement in an if-else.
//********************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guessing
{
    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        final int MAX = 10;
        int answer, guess;
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        System.out.print ("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is: ");
        guess = scan.nextInt();

        if (guess == answer)
            System.out.println ("You got it! Good guessing!");
        else
        {
            System.out.println ("That is not correct, sorry.");
            System.out.println ("The number was " + answer);
        }
    }
}

import java.lang.Math;
        import java.util.Scanner;

public class HiLo
{
    public static void main(String[] args)
    {
        int random = (int)(Math.random()*100);
        int num1;

        System.out.println(random);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter numbers between 1 and 100 and" +
                "\nsee if your guessed numbers are close to the random." +
                " Type 0 if you want to quit."
                + "\nENTER: ");
        num1 = keyboard.nextInt();

        while (num1 < random)
        {
            System.out.println("\ntoo low, try again?" + "\nto quit type -1");
            num1 = keyboard.nextInt();

            while (num1 > random)
            {
                System.out.println("\ntoo high, try again?" + "\nto quit type 0");
                num1 = keyboard.nextInt();
            }
            while (num1 == 0)
            {
                System.out.println("Thanks for playing! \n Answer was: " + random);
                return;
            }
        }
        System.out.println("\nCorrect");
    }
}

