package homework;

import java.util.Scanner;

/** Write a program to convert the upper case to lower case.
  */

public class Programme9_UppercaseToLowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an uppercase letter: ");

        char uppercase = scanner.next().charAt(0);

        char lowercase = Character.toLowerCase(uppercase);

        System.out.println("The lowercase equivalent is: " + lowercase);


    }
}
