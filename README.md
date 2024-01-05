# Travel Agency Management System

A Java-based software system for managing travel packages, itineraries, and passengers for travel agencies. Includes SOLID design principles, clean code practices.

## Project Overview

The Travel Agency Software System streamlines the management of travel packages, providing functionalities for creating itineraries, handling passenger sign-ups, and managing various passenger types.

## High-Level Diagram

![High-Level Diagram] https://drive.google.com/file/d/1dk-7ohX_q1UojYm9qaXV6xKfN3fQ01mi/view?usp=sharing

The high-level diagram illustrates the interaction between different sub-blocks of the system.

## Low-Level Diagram

![Low-Level Diagram] https://drive.google.com/file/d/1dk-7ohX_q1UojYm9qaXV6xKfN3fQ01mi/view?usp=sharing

The UML class diagram outlines the structure and relationships between the classes in the system.

## Implementation

### Class Descriptions

1. **Main Class (Main.java):**
   - Acts as the entry point for the application.
   - Collects user input for destinations, activities, passengers, and their details.

2. **Activity Class (Activity.java):**
   - Represents an activity with attributes like name, description, cost, capacity, and destination.

3. **Destination Class (Destination.java):**
   - Represents a destination with a name and a list of associated activities.

4. **Passenger Class (Passenger.java):**
   - Represents a passenger with attributes such as name, passenger number, type, balance, and a list of signed-up activities.

5. **PassengerType Enum (PassengerType.java):**
   - Enumerates passenger types: STANDARD, GOLD, PREMIUM.

6. **TravelPackage Class (TravelPackage.java):**
   - Represents a travel package with a name, passenger capacity, itinerary, and a list of passengers.

### Implementation Details

The implementation adheres to SOLID design principles, clean code guidelines, and includes proper Java code documentation.


## How to Run

below is instructions on how to run the Travel Agency Software System on a local machine.

```bash
# Example commands
git clone https://github.com/praatikgote/TravelAgencyManagementSystem
cd [repository_folder]
javac Main.java
java Main
