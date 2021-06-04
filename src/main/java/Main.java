import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice:");
        String s = in.nextLine();
        int f, c;
        if (s.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit:");
            f = in.nextInt();
            System.out.printf("The temperature in Celsius is %d\n", (int) ((f - 32) * 5 / 9));
        } else {
            System.out.print("Please enter the temperature in Celsius:");
            c =in.nextInt();
            System.out.printf("The temperature in Fahrenheit is %d\n", (int) (c * 9 / 5) + 32);
        }
    }
}
