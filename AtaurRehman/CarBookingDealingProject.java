import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    double price;

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

class CarBookingSystem {
    Car[] cars;
    int numOfCars;

    CarBookingSystem() {
        cars = new Car[100];
        numOfCars = 0;
    }

    void addCar(Car car) {
        if (numOfCars < 100) {
            cars[numOfCars] = car;
            numOfCars++;
            System.out.println("Car added successfully!");
        } else {
            System.out.println("Cannot add more cars. Limit reached.");
        }
    }

    void displayCars() {
        for (int i = 0; i < numOfCars; i++) {
            System.out.println("Car " + (i + 1));
            cars[i].display();
            System.out.println();
        }
    }
}

public class CarBookingDealingProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarBookingSystem carBookingSystem = new CarBookingSystem();

        while (true) {
            System.out.println("1. Add Car");
            System.out.println("2. Display Cars");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = scanner.next();
                    System.out.print("Enter model: ");
                    String model = scanner.next();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    Car car = new Car(brand, model, year, price);
                    carBookingSystem.addCar(car);
                    break;
                case 2:
                    carBookingSystem.displayCars();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
