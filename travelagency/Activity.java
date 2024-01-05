package travelagency;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { // Add this method
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void signUpPassenger(Passenger passenger) {
        if (capacity > 0) {
            passenger.signUpForActivity(this);
            capacity--;
        } else {
            System.out.println("Activity is full. Cannot sign up more passengers.");
        }
    }
}
