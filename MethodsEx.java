package org.example;
import java.util.Scanner;

public class MethodsEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        1 - Write a Java method to find the smallest number among three
//        numbers.

          System.out.println("Input the first number: ");
          double num1 = scanner.nextDouble();
          scanner.nextLine();

         System.out.println("Input the second number: ");
         double num2 = scanner.nextDouble();
         scanner.nextLine();

        System.out.println("Input the third number: ");
        double num3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The smallest value is: " + smallestVal(num1, num2, num3));

        System.out.println("-----------------------------------");

//        2 - Write a Java method that check if the entered number is negative or
//        positive or zero.

        System.out.println("Please enter any number to check if it is a positive, negative, or zero: ");
        int userNum = scanner.nextInt();
        scanner.nextLine();

        checkNum(userNum);

        System.out.println("-----------------------------------");
//
//        3 - Write a Java method to check whether a string is a valid password.
//        Password rules:
//        A password must have at least ten characters. A
//        password consists of only letters and digits. A
//        password must contain at least two digits.

        System.out.println("1. A password must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.nextLine();

        if (checkPass(password)) {

            System.out.println("Password is valid: " + password);

        } else {
            System.out.println("Password is not valid: " + password);
        }


    }


    public static double smallestVal(double num1, double num2, double num3) {

        double result = Math.min(Math.min(num1, num2), num3);
        return result;
    }


    public static void checkNum(int number) {

        if (number > 0) {
            System.out.println(number + " is a positive number.");

        } else if (number < 0) {
            System.out.println(number + " is a negative number.");

        } else System.out.println("It is zero.");


    }

    public static boolean checkPass(String pass) {

        if (pass.length() < 10) {

            System.out.println("Try again! a password must have at least ten characters.");
            return false;
        }

        ////////////////////////////////////////////////////

        for (int s = 0; s < pass.length(); s++) {

            char contain = pass.charAt(s);
            if (!Character.isLetterOrDigit(contain)) {

                System.out.println("Try again! a password consists of only letters and digits.");
                return false;
            }
        }

        /////////////////////////////////////////////////

            int digitCount = 0;
            for (int d = 0; d < pass.length(); d++) {

                char digit = pass.charAt(d);
                if (Character.isDigit(digit)) {
                    digitCount++;
                }
            }

            if (digitCount < 2) {

                System.out.println("Try again! a password must contain at least two digits  ");
                return false;
        }


            return true;
    }







}