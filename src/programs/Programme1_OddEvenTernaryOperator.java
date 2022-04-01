package programs;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that input number is odd or even?
 * HINT: use ternary operator(? :)
 */

public class Programme1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the Scanner object
        scanner.close();;
    }

    //checking the number is even or odd
    public static void  isItOddOrEvenNumber(int number){
        String EvenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The "+number + " is "+ EvenOrOdd + " number");
    }
}
