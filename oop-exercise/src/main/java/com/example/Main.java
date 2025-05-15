package com.example;

import com.example.Shapes.Circle;
import com.example.Shapes.Rectangle;
import com.example.Shapes.Squre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Method that validates parameters of shapes
    // If parameter is invalid asks again for correct input
    public static double inputValidate(Scanner scanner, String caption){
        while(true){
            try{
                System.out.print(caption);
                double input = scanner.nextDouble();
                if (input <= 0 ){
                    throw new InputMismatchException(); // if the number is invalid, throws input mismatch exception
                }
                return input;

            }catch(InputMismatchException e){
                System.err.println("Enter a valid number");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelect a Shape \n " +
                "\t 1.Rectangle \n" +
                "\t 2.Squre \n" +
                "\t 3.Circle ");
        String shape = scanner.nextLine().toLowerCase();

        // switchcase to process different shapes
        switch (shape) {
            case "rectangle":
                double width = inputValidate(scanner,"Enter the width of the rectangle :");
                double height = inputValidate(scanner,"Enter the height of the rectangle :");
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println(rectangle);
                break;
            case "squre":
                double length = inputValidate(scanner,"Enter the length of the square :");
                Squre squre = new Squre(length);
                System.out.println(squre);
                break;
            case "circle":
                double radius = inputValidate(scanner,"Enter the radius of the circle :");
                Circle circle = new Circle(radius);
                System.out.println(circle);
                break;
            default: // if entered shape doesn't match any of existing shapes returns message
                System.out.println("Invalid input");
        }
    }
}