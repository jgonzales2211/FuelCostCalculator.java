/* Problem 1: Fuel Efficiency
Design a program that calculates the fuel cost per 100 miles and how far the car can go with a full tank of gas.
Your program needs to acquire the following inputs from the user: (1) the number of gallons of gas in the tank, (2) the fuel efficiency in miles per gallon, (3) the price of gas per gallon.
Your program needs to display the cost per 100 miles and how far the car can go with a full tank of gas.
Extra requirement:
•	Your program must start with a display to the user what the program does.
•	When acquiring the information from the user, your program must give clear instruction on what data the user should input and in what format (whole number or floating-point number).
•	When displaying any monetary amount, your program must prefix the amount with $ and keeps exactly two digits after the decimal points.
•	The variable names must be descriptive to the quantity they represent.
•	The number of miles the car can go with a full tank of gas must be displayed as a whole number.
 */
import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displays program description
        System.out.println("This program calculates the cost of fuel per 100 miles and how far the car can go with a full tank of gas.") ;

        // Gets the number of gallons in the tank
        System.out.print("Enter the number of gallons of gas in the tank (e.g., 15): ");
        double gallonsInTank = scanner.nextDouble();

        // Gets the fuel efficiency
        System.out.print("Enter the fuel efficiency in miles per gallon (e.g., 25.5): ");
        double milesPerGallon = scanner.nextDouble();

        // Gets the price per gallon
        System.out.print("Enter the price of gas per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Calculates the cost per 100 miles
        double costPer100Miles = (100 / milesPerGallon) * pricePerGallon;

        // Calculates the maximum distance the car can go with a full tank
        int maxDistance = (int) (gallonsInTank * milesPerGallon);

        // Displays the results
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.println("Maximum distance on a full tank: " + maxDistance + " miles");

        scanner.close();
    }
}