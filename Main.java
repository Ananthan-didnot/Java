class Car {
    String make = "Toyota";
    String model = "Supra";
    int year = 2020;

    void start() {
        System.out.println("The car is starting.");
    }

    void stop() {
        System.out.println("The car is stopping.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        System.out.println("Car make: " + myCar.make);
        System.out.println("Car model: " + myCar.model);
        System.out.println("Car year: " + myCar.year);
        myCar.stop();
    }
}
