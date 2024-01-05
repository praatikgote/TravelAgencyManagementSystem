package travelagency;

import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType passengerType, double balance,
            List<Activity> activities) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void signUpForActivity(Activity activity) {
        activities.add(activity);
        if (passengerType == PassengerType.STANDARD) {
            balance -= activity.getCost();
        } else if (passengerType == PassengerType.GOLD) {
            balance -= (activity.getCost() * 0.9);
        }
    }

    public void printDetails() {
        System.out.println("Passenger Details: ");
        System.out.println("Name: " + name);
        System.out.println("Number: " + passengerNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Activities: ");
        for (Activity activity : activities) {
            System.out.println("  Activity: " + activity.getName() +
                    ", Destination: " + activity.getDestination().getName() +
                    ", Price: " + activity.getCost());
        }
    }
}
