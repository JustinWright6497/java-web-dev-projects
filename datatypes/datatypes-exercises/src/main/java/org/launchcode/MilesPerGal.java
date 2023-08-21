package org.launchcode;
import java.util.Scanner;

public class MilesPerGal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you gone?");
        int miles = input.nextInt();

        System.out.println("How many gallons of gas have you used?");
        int gallons = input.nextInt();

        int mpg = miles / gallons;
        System.out.println("Your miles per gallon is: " + mpg);
    }
}
