package test;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (1-255): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Please enter a number between 1 and 255.");
        } else {
          
            String binaryString = Integer.toBinaryString(number);

           
            binaryString = String.format("%8s", binaryString).replace(' ', '0');

            System.out.println("Binary representation: " + binaryString);
        }

        scanner.close();
    }
}

