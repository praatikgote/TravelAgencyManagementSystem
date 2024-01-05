package travelagency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for Destination
        System.out.print("Enter the name of the destination: ");
        String destinationName = scanner.nextLine();

        // Getting user input for Activity
        System.out.print("Enter the name of the activity: ");
        String activityName = scanner.nextLine();

        System.out.print("Enter the description of the activity: ");
        String activityDescription = scanner.nextLine();

        System.out.print("Enter the cost of the activity: ");
        double activityCost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the capacity of the activity: ");
        int activityCapacity = scanner.nextInt();
        scanner.nextLine();

        // Creating Destination and Activity objects with user input
        Destination destination1 = new Destination(destinationName, new ArrayList<>());
        Activity activity1 = new Activity(activityName, activityDescription, activityCost, activityCapacity,
                destination1);
        destination1.getActivities().add(activity1);

        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination1);

        TravelPackage travelPackage = new TravelPackage("My Travel Package", 20, itinerary, new ArrayList<>());

        // Getting user input for Passenger
        System.out.print("Enter the name of passenger 1: ");
        String passenger1Name = scanner.nextLine();

        System.out.print("Enter the balance of passenger 1: ");
        double passenger1Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble

        System.out.print("Enter the name of passenger 2: ");
        String passenger2Name = scanner.nextLine();

        System.out.print("Enter the balance of passenger 2: ");
        double passenger2Balance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble

        // Creating Passenger objects with user input
        Passenger passenger1 = new Passenger(passenger1Name, 1, PassengerType.STANDARD, passenger1Balance,
                new ArrayList<>());
        Passenger passenger2 = new Passenger(passenger2Name, 2, PassengerType.GOLD, passenger2Balance,
                new ArrayList<>());

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        travelPackage.printItinerary();
        travelPackage.printPassengerList();
        List<Activity> availableActivities = travelPackage.getAvailableActivities();

        if (availableActivities != null) {
            System.out.println("Available Activities:");
            for (Activity activity : availableActivities) {
                System.out.println("  " + activity.getName());
            }
        } else {
            System.out.println("Error retrieving available activities.");
        }

        // Assuming user input for signing up passengers for activities
        activity1.signUpPassenger(passenger1);
        activity1.signUpPassenger(passenger2);

        passenger1.printDetails();
        passenger2.printDetails();

        // Close the scanner
        scanner.close();
    }
}
