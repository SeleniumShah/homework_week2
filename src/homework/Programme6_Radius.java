package homework;

import java.util.Scanner;

public class Programme6_Radius {

    /**Write a program to enter any radius value of the circle and find out the
     area.(Formula of Area A=PI*r*r).
     */
    public static void entNum() {
        System.out.println("Enter the radius of the circle: ");
    }

    public static void circleRadius(double radius) {
        double ans = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + ans);
    }

    public static void main(String[] args) {
        entNum();
        Scanner sr = new Scanner(System.in);
        double radius = sr.nextDouble();
        circleRadius(radius);
    }

}
