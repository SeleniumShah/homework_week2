package homework;

import java.util.Scanner;

public class Programme5_Calculator {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */
    public static void main(String[] args) {
        number();
        Scanner sr = new Scanner(System.in);
        int a = (int) sr.nextDouble();
        int b = (int) sr.nextDouble();

        Programme5_Calculator pc1  = new Programme5_Calculator();

        addition(a,b);
        subtraction(a,b);
        pc1.multiplication(a, b);
        pc1.division(a,b);


    }

    public static void number(){
        System.out.println("Enter two numbers : ");

    }

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition : " + a + " + " + b + " = " + result);
    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction : " + a + " - " + b + " = " + result);
    }

    public void multiplication(int a, int b) {
        int  result = a * b;
        System.out.println("Multiplication : " + a + " * " + b + " = " + result);
    }

    public void division(int a, int b) {
         int  result = a / b;
            System.out.println("Division : " + a + " / " + b + " = " + result);
        }

        }









